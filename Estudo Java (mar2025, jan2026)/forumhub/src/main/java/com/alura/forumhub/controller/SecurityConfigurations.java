package com.alura.forumhub.controller;
//optei por usar o swagger pra testar e ele travou na segurança. Por isso escolhi criar essa classe

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(csrf -> csrf.disable()) // <--- Aqui desligamos o CSRF que estava bloqueando o POST
                .authorizeHttpRequests(req -> {
                    req.anyRequest().authenticated(); // Exige login para tudo
                })
                .httpBasic(Customizer.withDefaults()) // Ativa o login simples (que o Swagger usa)
                .build();
    }
}
