package com.enable.maintenance;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
public class WebMvcAutoConfiguration extends WebMvcConfigurerAdapter {
	
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/**").setViewName("forward:/index.html");
	}

}
