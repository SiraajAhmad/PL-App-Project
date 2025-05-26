package com.example.premierleagueapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration  {

   
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
     
    @Bean
     public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
         http
                 .authorizeHttpRequests((authorizeRequests) ->
                         authorizeRequests
                         		 .requestMatchers("/api/auth/login").permitAll()
                                 .requestMatchers("/api/auth/register", "/api/auth/login").permitAll() 
                 				 .anyRequest().permitAll())					
                 .logout(logout -> logout
                         .logoutSuccessUrl("/login?logout")
                         .permitAll())
                 .csrf().disable();
         return http.build();
    }

    
    
    
    
   
}
