package com.curso.ecomerce;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@SuppressWarnings("unused")
@Configuration
public class ResourceWebConfiguration implements WebMvcConfigurer {
	
	 @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        WebMvcConfigurer.super.addResourceHandlers(registry);
	        registry.addResourceHandler("/images/**").addResourceLocations("file:images/");
	    }
	
	 public interface WebMvc {

		}
}


