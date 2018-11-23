package com.ekspract.restsecurity;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 * Spring Security then invokes our specified authentication success handler.
 * This is where Spring Security would clear the authentication attributes,
 * apply some redirection strategy to a defined target URL and even retrieve a
 * cached request to submit it (so that after a successful login the system
 * re-submits the request that triggered the redirection to an authentication
 * page; in other words, it allows resuming the flow that was interrupted by a
 * login request).
 * 
 * But, once again, we’re dealing with web services here so we only want the
 * server to respond with a 200 HTTP status that the login was successful.
 * 
 * @author eknath.take
 *
 */
@Component
public class RESTAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		clearAuthenticationAttributes(request);
	}
}