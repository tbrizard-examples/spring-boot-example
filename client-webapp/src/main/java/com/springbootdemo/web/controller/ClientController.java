package com.springbootdemo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo.clientservice.business.model.Client;
import com.springbootdemo.clientservice.business.service.ClientService;
import com.springbootdemo.web.resource.ClientResource;


@RestController
public class ClientController {

	@Autowired
	private ClientService clientService;	
	
	@RequestMapping(value="clients/{clientId}/", method=RequestMethod.GET)
	public ClientResource findClient(@PathVariable String clientId) {
		
		// really simple implementation just to show that this class gets called
		// for the correct request mapping
		Client client = clientService.findClient(clientId);
				
		if (client != null) {
			ClientResource res = new ClientResource(client.getId(), client.getLastName(), client.getFirstName());
			return res;
		}
		
		throw new ResourceNotFoundException();
	}
}
