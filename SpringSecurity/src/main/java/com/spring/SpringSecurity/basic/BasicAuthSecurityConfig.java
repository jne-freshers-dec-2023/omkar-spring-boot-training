package com.spring.SpringSecurity.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BasicAuthSecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> {
            ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests.anyRequest()).authenticated();
        });

        http.sessionManagement(
                session ->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        );
        // http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());
//        http.csrf().disable();
        return (SecurityFilterChain)http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        var user = User.withUsername("omkar")
                .password("{noop}dummy")
                .roles("USER")
                .build();
        var admin = User.withUsername("admin")
                .password("{noop}dummy")
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user,admin); // used to store user credintial in memory.
    }
}
