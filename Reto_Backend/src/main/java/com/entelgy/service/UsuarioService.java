package com.entelgy.service;

import com.entelgy.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Service
public class UsuarioService {
	
	
	@Value("${base-url}")
	private String baseUrl;
	
 
	public String getUsers() {
		String url = baseUrl;
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(url, String.class);
	}
	
	public Usuario saveUsuario(Usuario usuario) {
		String url = baseUrl+"/users";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(url,usuario,Usuario.class);
	}
	

	}
