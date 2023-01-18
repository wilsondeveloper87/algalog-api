package com.algaworks.algalog.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;
import com.algaworks.algalog.domain.repository.ClienteRepository;

@RestController
public class ClienteController {

	@Autowired
	ClienteRepository repository;
	
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		return repository.findByNomeContaining("Maria");
	}
	
	/*
	 * @GetMapping("/clientes") public List<Cliente> listar2() { return
	 * repository.findByNome("Maria J"); }
	 */
	/*
	 * @GetMapping("/clientes") public List<Cliente> listar() { return
	 * repository.findAll(); }
	 */
	
}
