package com.ysd.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("Yog").password("Yog").roles("Developer");
		auth.inMemoryAuthentication().withUser("Adam").password("Adam").roles("Manager");
	}

	// Authenticate all request
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * 
	 * http.csrf().disable();
	 * http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
	 * 
	 * }
	 */

	// Authenticate specific request/url
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * 
	 * http.csrf().disable();
	 * http.authorizeRequests().antMatchers("/info/**").fullyAuthenticated().and().
	 * httpBasic();
	 * 
	 * }
	 */

	// Role based authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//permitall
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/info/**").hasAnyRole("Manager").antMatchers("/info/**")
				.hasAnyRole("Developer").anyRequest().fullyAuthenticated().and().httpBasic();

	}

	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();

	}
}