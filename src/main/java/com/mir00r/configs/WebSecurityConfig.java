package com.mir00r.configs;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;

//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig {
//
//  // Array containing different swagger URL patterns to be whitelisted or secured based on roles
//  private static final String[] SWAGGER_WHITELIST = {
//    "/swagger-resources/**",
//    "/swagger-ui/**",
//    "/v2/api-docs",
//    "/v3/api-docs/**",
//    "/webjars/**",
//    "/swagger-ui.html"
//  };
//
//  // Define the main security configuration for handling different aspects of security
//  @Bean
//  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//    http
//      // Default exception handling for security-related errors (e.g., 403, 401)
//      .exceptionHandling(Customizer.withDefaults())
//
//      // Configure authorization rules for different endpoints
//      .authorizeHttpRequests(auth -> auth
//        // Allow all users to access /swagger/** without any authentication or authorization
//        .requestMatchers(SWAGGER_WHITELIST).permitAll() // public endpoints for swagger
//
//        // Any other requests not explicitly matched above should be authenticated
//        .anyRequest().authenticated() // Secures all other endpoints
//      )
//
//      // Disable CSRF protection since this is a stateless REST API (not form-based)
//      .csrf(AbstractHttpConfigurer::disable)
//
//      // Enable CORS (Cross-Origin Resource Sharing) with default settings
//      .cors(Customizer.withDefaults())
//
//      // Ensure the session management policy is stateless (since tokens or basic auth is used)
//      .sessionManagement(ses -> ses.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//
//      // Enable HTTP Basic Authentication for the API (username and password authentication)
//      .httpBasic(Customizer.withDefaults())
//    ;
//
//    // Build and return the SecurityFilterChain object
//    return http.build();
//  }
//
//
//  // Define a bean for the password encoder using BCrypt (a secure hash function for password storage)
//  @Bean
//  public PasswordEncoder passwordEncoder() {
//    // Use BCryptPasswordEncoder for securely hashing and verifying passwords
//    return new BCryptPasswordEncoder();
//  }
//}
