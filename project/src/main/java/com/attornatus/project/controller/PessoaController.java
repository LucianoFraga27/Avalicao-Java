package com.attornatus.project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attornatus.project.domain.model.Pessoa;
import com.attornatus.project.domain.repository.PessoaRepository;
import com.attornatus.project.domain.service.CadastroPessoaService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/pessoas")
public class PessoaController {

	private PessoaRepository repository;
	
	@GetMapping
	public List<Pessoa> listar(){
		return repository.findAll();
	}
	
}
