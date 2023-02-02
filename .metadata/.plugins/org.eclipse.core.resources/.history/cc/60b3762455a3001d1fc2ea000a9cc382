package com.attornatus.project.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.attornatus.project.domain.model.Pessoa;
import com.attornatus.project.domain.repository.PessoaRepository;

@Service
public class CadastroPessoaService {
	
	private PessoaRepository repository;
	
	@Transactional
	public Pessoa salvar(Pessoa pessoa) {
		return repository.save(pessoa);
	}
	
	@Transactional
	public void excluir(Long id) {
		repository.deleteById(id);
	}
}
