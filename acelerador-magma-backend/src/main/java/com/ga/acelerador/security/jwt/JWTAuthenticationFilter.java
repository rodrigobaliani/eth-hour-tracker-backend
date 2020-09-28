package com.ga.acelerador.security.jwt;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ga.acelerador.ErrorResponse;
import com.ga.acelerador.security.AuthenticationRequest;
import com.ga.acelerador.util.Constants;
import com.ga.acelerador.util.Constants.Parameter;
import com.ga.acelerador.util.Constants.SecurityConstants;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter{
	
	@Autowired
    private AuthenticationManager authenticationManager;
 
    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.setFilterProcessesUrl(Constants.Parameter.API_URL_SUFFIX + "/login");
        this.authenticationManager = authenticationManager;
    }
 
    public JWTAuthenticationFilter() {
 
    }
 
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException {
 
        try {
            AuthenticationRequest user = new ObjectMapper().readValue(request.getInputStream(),
                    AuthenticationRequest.class);
			// Password con encriptacion - Utilizar para pruebas con frontend
       //     byte[] decodedBytes = Base64.getUrlDecoder().decode(user.getPassword());
		//	String decodedPassword = new String(decodedBytes);
			
			// Password sin encriptacion - Utilizar para pruebas con postman
			String decodedPassword = user.getPassword();
 
            return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),
            		decodedPassword, new ArrayList<>()));
            
 
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
 
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
            Authentication auth) throws IOException, ServletException {
 
        UserDetails userDetails = ((UserDetails) auth.getPrincipal());
 
        String authToken = generateToken(userDetails);
 
        if (authToken != null) {
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            response.getOutputStream().print(new ObjectMapper().writeValueAsString(authToken));
        }
 
    }
 
    private String generateToken(UserDetails cud) {
        String token = null;
 
        final JWTCreator.Builder builder = JWT.create();
 
 
        token = builder.withClaim(Constants.SecurityConstants.TOKEN_NAME_FIELD, cud.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + Constants.SecurityConstants.EXPIRATION_TIME))
                .sign(Algorithm.HMAC256(Constants.SecurityConstants.TOKEN_SECRET));
 
        return token;
    }
 
    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException failed) throws IOException, ServletException {
 
        List<String> details = new ArrayList<String>();
        String message = "Usuario o password invalidos";
       
        ErrorResponse errorResponse = new ErrorResponse(message, details , HttpStatus.UNAUTHORIZED);
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        
        OutputStream out = response.getOutputStream();
       
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(out, errorResponse);
       
        out.flush();
    }
 
    @Override
    public void setAuthenticationFailureHandler(AuthenticationFailureHandler failureHandler) {
 
        super.setAuthenticationFailureHandler(failureHandler);
        
    }

}
