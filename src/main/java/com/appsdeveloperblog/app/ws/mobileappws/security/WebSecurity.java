//package com.appsdeveloperblog.app.ws.mobileappws.security;
//
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import com.appsdeveloperblog.app.ws.mobileappws.service.UserService;
//
//@EnableWebSecurity
//public class WebSecurity extends WebSecurityConfigurerAdapter {
//	private final UserService userService;
//	
//	private final BCryptPasswordEncoder bCryptPasswordEncoder;
//	
//	public WebSecurity (UserService userService, BCryptPasswordEncoder bCryptPasswordEncoder) {
//		this.userService = userService;
//		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception{
//		http.csrf().disable().authorizeRequests()
//		.antMatchers(HttpMethod.POST, SecurityConstants.SIGN_UP_URL)
//		.permitAll()
//		.anyRequest().authenticated();
//	}
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userService).passwordEncoder(bCryptPasswordEncoder);
//	}
//// 
//	// Cái interface userService trong hàm này giúp spring load được user từ database
//}
