package com.ga.accelerator.security;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ga.accelerator.ErrorResponse;

@Component
public class authenticationEntryPoint implements AuthenticationEntryPoint  {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		// TODO Auto-generated method stub
	    List<String> details = new ArrayList<String>();
	        details.add("No puede acceder al recurso");
	       
	        ErrorResponse errorResponse = new ErrorResponse("Acceso Denegado", details , HttpStatus.FORBIDDEN);
	        response.setStatus(HttpStatus.FORBIDDEN.value());
	        
	        OutputStream out = response.getOutputStream();
	       
	        ObjectMapper mapper = new ObjectMapper();
	        mapper.writeValue(out, errorResponse);
	       
	        out.flush();

	}

}
