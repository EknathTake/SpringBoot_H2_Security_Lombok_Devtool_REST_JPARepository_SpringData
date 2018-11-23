package com.ekspract.restsecurity;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * By implementing our own authentication entry point, we can tell Spring
 * Security exactly what to do if someone tries to access a protected resource
 * without being authenticated. But we are dealing with web services here, so
 * what we actually want our system to do is: “if the client accesses a resource
 * but is not authenticated, we respond with a 401 Unauthorized status“.
 * 
 * @author eknath.take
 *
 */
@Component
public class RESTAuthenticationEntryPoint implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {

		response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
	}
}