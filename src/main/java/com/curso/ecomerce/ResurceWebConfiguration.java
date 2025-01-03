package com.curso.ecomerce;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.curso.ecomerce.ResurceWebConfiguration.WebMvc;

import java.util.List;

@SuppressWarnings("unused")
@Configuration
public class ResurceWebConfiguration implements WebMvcConfigurer {
	
   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/images/**").addResourceLocations("file:images/");
}

	public interface WebMvc {

	}

}
