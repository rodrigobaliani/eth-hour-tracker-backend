package com.ga.acelerador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
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
 
            return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),
                    user.getPassword(), new ArrayList<>()));
 
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
 
        super.unsuccessfulAuthentication(request, response, failed);
    }
 
    @Override
    public void setAuthenticationFailureHandler(AuthenticationFailureHandler failureHandler) {
 
        super.setAuthenticationFailureHandler(failureHandler);
    }

}
