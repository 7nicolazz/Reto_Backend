package com.entelgy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.entelgy.controller.UsuarioControlador;
import com.entelgy.model.Usuario;
import com.entelgy.service.UsuarioService;

@SpringBootTest
class RetoBackendApplicationTests {

	@Test
	void contextLoads() {
	}

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
