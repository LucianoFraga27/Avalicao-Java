package com.attornatus.project.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.attornatus.project.domain.exception.DomainException;
import com.attornatus.project.domain.model.Pessoa;
import com.attornatus.project.domain.repository.PessoaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CadastroPessoaService {
	
	private PessoaRepository pessoaRepository;
	
	public Pessoa buscar(Long id) {
		return pessoaRepository.findById(id).orElseThrow(() -> new DomainException("pessoa não encontrada"));//Implementar exception
	}
	
	@Transactional
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@Transactional
	public void excluir(Long id) {
		pessoaRepository.deleteById(id);
	}
}
