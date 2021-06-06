package com.fullstackclouddeveloper.landingpageservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/course/full-stack-cloud-developer-mini-course").setViewName("redirect:/course/full-stack-cloud-developer-mini-course/");
        registry.addViewController("/course/full-stack-cloud-developer-mini-course/").setViewName("forward:/course/full-stack-cloud-developer-mini-course/index.html");

        registry.addViewController("/app").setViewName("redirect:/app/");
        registry.addViewController("/app/").setViewName("forward:/app/index.html");
    }
}
