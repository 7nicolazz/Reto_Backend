package com.entelgy.service;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.entelgy.controller.UsuarioControlador;
import com.entelgy.model.Usuario;

public class UsuarioServiceTest {
	
	
	@Mock
	private UsuarioControlador usuarioControlador;
	
	@InjectMocks
	private UsuarioService usuarioService;
	
	private Usuario usuario;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
		
		usuario = new Usuario();
		usuario.setId(new Integer(50));
		usuario.setEmail("nico@gmail.com");
		usuario.setLast_name("Bravo");
	
		
	}
	
}
