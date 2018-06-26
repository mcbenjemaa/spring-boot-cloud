package com.enable.maintenance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;


@EnableAutoConfiguration
@Configuration
@SpringBootApplication
@Controller
public class MaintenanceAppApplication  {

	public static void main(String[] args) {
		SpringApplication.run(MaintenanceAppApplication.class, args);
	}
	
	
	
	
	
	/*@GetMapping(value="/**")
	public String home(Model model) {
		
		
		return "redirect:/index.html";
	}*/
	
	
	
}
