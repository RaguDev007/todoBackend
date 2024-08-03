//package com.BookMangment.demo.configuration;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//public class BasicAuthFilter extends OncePerRequestFilter {
//
//	
//	 @Override
//	    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//	        // Extract username and password from request headers
//	        String username = request.getHeader("Authorization");
//	        String password = request.getHeader("Password");
//
//	        // Validate credentials against your MySQL database
//	        // Implement your custom logic here
//
//	        // If valid, create an Authentication object
//	        Authentication auth = new CustomAuthentication(username, password);
//
//	        // Set the Authentication in the SecurityContext
//	        SecurityContextHolder.getContext().setAuthentication(auth);
//
//	        filterChain.doFilter(request, response);
//	    }
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response,
//			jakarta.servlet.FilterChain filterChain) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//	}
//}
