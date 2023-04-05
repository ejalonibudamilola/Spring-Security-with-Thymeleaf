package com.gnlsystems.vcs;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;



@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @EnableWebMvc
    @ComponentScan("com.gnlsystems.vcs")
    public class WebMvcConfiguration implements WebMvcConfigurer {

        // ...

        @Override
        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/loginForm").setViewName("securedLoginForm");
            registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        }
    }
}
