package com.springbootdemo.clientservice.business.service;

import org.springframework.stereotype.Service;

import com.springbootdemo.clientservice.business.model.Client;

/**
 *
 */
@Service
public class ClientServiceImpl implements ClientService {

	public Client findClient(String clientId) {
		
		// incredibly fake code here just to illustrate that this class gets called
		if ("1".equalsIgnoreCase(clientId)) {
			return new Client("1", "Wiggins", "Bob");
		} else if ("2".equalsIgnoreCase(clientId)) {
			return new Client("2", "Falcon", "Scott");
		}
		
		return null;
	}
}
