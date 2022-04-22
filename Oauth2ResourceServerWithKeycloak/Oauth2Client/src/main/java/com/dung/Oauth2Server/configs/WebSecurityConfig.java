package com.dung.Oauth2Server.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors()
                .and()
                    .authorizeRequests()
                    .antMatchers("/hello").permitAll()
                    .antMatchers("/api**").hasRole("user")
                    .anyRequest().authenticated()
                .and()
                    .oauth2ResourceServer().jwt();
    }
}
