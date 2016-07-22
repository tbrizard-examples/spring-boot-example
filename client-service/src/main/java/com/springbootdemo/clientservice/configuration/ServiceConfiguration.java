package com.springbootdemo.clientservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbootdemo.clientservice.business.service.ClientService;
import com.springbootdemo.clientservice.business.service.ClientServiceImpl;

@Configuration
public class ServiceConfiguration {
	
	@Bean
	public ClientService clientService() {
		return new ClientServiceImpl();
	}
}
