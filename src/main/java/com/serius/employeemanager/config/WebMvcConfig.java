package com.serius.employeemanager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://employeemanagerbucket.s3-website.ap-south-1.amazonaws.com/")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("Content-Type", "X-Auth-Token", "Authorization")
                .exposedHeaders("header1", "header2")
                .allowCredentials(false)
                .maxAge(3600);
    }
}
