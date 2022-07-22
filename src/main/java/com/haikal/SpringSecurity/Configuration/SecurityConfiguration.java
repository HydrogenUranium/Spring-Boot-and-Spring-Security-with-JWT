package com.haikal.SpringSecurity.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;

@Configuration
public class SecurityConfiguration {
    /*
     * @Override
     * public void configure(WebSecurity web) throws Exception {
     * web
     * .ignoring()
     * .antMatchers("/h2-console/**");
     * }
     */

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().antMatchers("/h2-console/**", "/ignore2");
    }
}
