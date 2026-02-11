package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		// @formatter:off
        http
            .authorizeHttpRequests((authorize) -> authorize
                 // allow static files
                .requestMatchers("/webjars/**", "/images/**", "/js/**", "/css/**").permitAll()
                .anyRequest().authenticated()
            );

        http
            .formLogin(Customizer.withDefaults())
            .logout(Customizer.withDefaults());

        http
            .cors(Customizer.withDefaults())
            .headers(
                headers -> headers.frameOptions(frame -> frame.sameOrigin())
            );

        return http.build();
        // @formatter:on
	}

}
