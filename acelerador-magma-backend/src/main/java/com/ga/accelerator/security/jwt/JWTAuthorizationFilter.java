package com.ga.accelerator.security.jwt;

/*import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.ga.accelerator.util.Constants;
import com.ga.accelerator.util.Constants.SecurityConstants;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {
	
	public JWTAuthorizationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }
 
    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        String header = req.getHeader(HttpHeaders.AUTHORIZATION);
 
        if (header == null) {
            chain.doFilter(req, res);
 
            return;
        }
 
        UsernamePasswordAuthenticationToken authentication = getAuthentication(req);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(req, res);
    }
 
    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
 
        String token = request.getHeader(HttpHeaders.AUTHORIZATION);
 
        if (token != null) {
            // Se procesa el token
            DecodedJWT decodedToken = null;
 
            try {
                decodedToken = JWT.require(Algorithm.HMAC256(Constants.SecurityConstants.TOKEN_SECRET)).build()
                        .verify(token);
            } catch (TokenExpiredException e) {
                return null;
            }
 
            String user = decodedToken.getClaim(Constants.SecurityConstants.TOKEN_NAME_FIELD).as(String.class);
 
 
            if (user != null) {
                return new UsernamePasswordAuthenticationToken(user, null, new ArrayList<>());
            }
            return null;
        }
        return null;
    }

}*/
