package com.ekspract.application;

import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableWebSecurity
public class SecurityConfig /* extends WebSecurityConfigurerAdapter */ {

	/*
	 * @Override public void configure(WebSecurity web) throws Exception {
	 * web.ignoring() // Spring Security should completely ignore URLs starting with
	 * /resources/ .antMatchers("/resources/**"); }
	 */
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.authorizeRequests().antMatchers("",
	 * "/home").permitAll().antMatchers("/user/**").permitAll().anyRequest()
	 * .hasRole("USER").antMatchers("/user/**").permitAll().anyRequest().hasRole(
	 * "ADMIN")
	 * .antMatchers("/admin/**").permitAll().anyRequest().hasRole("ADMIN").and() //
	 * Possibly more configuration ... .formLogin() // enable form based log in
	 * .loginPage("/login").failureUrl("/login") // set permitAll for all URLs
	 * associated with Form Login
	 * .permitAll().and().logout().logoutSuccessUrl("/login").permitAll(); }
	 */

	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception { // enable in memory based authentication with a user named "user"
	 * and "admin"
	 * auth.inMemoryAuthentication().withUser("user").password("password").roles(
	 * "USER").and().withUser("admin") .password("password").roles("USER", "ADMIN");
	 * }
	 */

}
