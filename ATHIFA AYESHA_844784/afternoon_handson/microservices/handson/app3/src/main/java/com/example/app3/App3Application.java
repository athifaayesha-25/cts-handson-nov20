package com.example.app3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class App3Application {

	public static void main(String[] args) {
		SpringApplication.run(App3Application.class, args);
	}
	
	// we are not using @LoadBalanced because we have not registered this in service discovery
	@Bean
	public RestTemplate restTemlate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
