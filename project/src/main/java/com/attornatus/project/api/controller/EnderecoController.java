package com.attornatus.project.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.attornatus.project.domain.model.Endereco;
import com.attornatus.project.domain.service.CadastroEnderecoService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
	
	private CadastroEnderecoService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Endereco criarEndreco(@RequestBody Endereco endereco) {
		return service.cadastrar(endereco);
	}

}
