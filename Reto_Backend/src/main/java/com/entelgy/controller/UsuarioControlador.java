package com.entelgy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.entelgy.model.Usuario;
import com.entelgy.service.UsuarioService;


@RestController
@RequestMapping("/api/users")
public class UsuarioControlador {
	
	@Autowired
	private UsuarioService usuarioService;
	
	public UsuarioControlador(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}
    //METODO GET
	@GetMapping
	public String getUsuarios() {
		return usuarioService.getUsers();
	}
	
	//METODO POST 
	@PostMapping
	public ResponseEntity<Usuario> save(@RequestBody(required=true)Usuario usuario){
		return new ResponseEntity<Usuario>(usuarioService.saveUsuario(usuario), HttpStatus.CREATED);
	}

	
	
}























