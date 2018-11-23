package com.ekspract.application;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.ekspract.restsecurity.RESTAuthenticationEntryPoint;
import com.ekspract.restsecurity.RESTAuthenticationFailureHandler;
import com.ekspract.restsecurity.RESTAuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Inject
	private RESTAuthenticationEntryPoint authenticationEntryPoint;

	@Inject
	private RESTAuthenticationFailureHandler authenticationFailureHandler;

	@Inject
	private RESTAuthenticationSuccessHandler authenticationSuccessHandler;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.exceptionHandling().authenticationEntryPoint(authenticationEntryPoint);
		http.authorizeRequests().antMatchers("/", "/home").permitAll().anyRequest().authenticated().and().formLogin()
				.loginPage("/login").successHandler(authenticationSuccessHandler)
				.failureHandler(authenticationFailureHandler).permitAll().and().logout().permitAll();

	}

	@Autowired
	public void configureAuth(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("thomas").password("password").roles("USER").and().withUser("joe")
				.password("password").roles("USER").and().withUser("admin").password("password").roles("ADMIN");
	}

}
