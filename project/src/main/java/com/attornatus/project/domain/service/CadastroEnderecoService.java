package com.attornatus.project.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.attornatus.project.domain.model.Endereco;
import com.attornatus.project.domain.model.Pessoa;
import com.attornatus.project.domain.model.TipoEndereco;
import com.attornatus.project.domain.repository.EnderecoRepository;
import com.attornatus.project.domain.repository.PessoaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CadastroEnderecoService {

	private CadastroPessoaService pessoaService;
	private EnderecoRepository enderecoRepository;
	
	@Transactional
	public Endereco cadastrar(Endereco endereco) {
		/*
		 * Implementar logica de :
		 * Se não existir nenhum endereco com esse Id, 
		 * Deixar como principal,
		 * Se ja existir, apenas bote como secundario
		 * */
		
		Pessoa pessoa = pessoaService.buscar(endereco.getPessoa().getId());
		endereco.setPessoa(pessoa);
		endereco.setTipoEndereco(TipoEndereco.PADRÃO);
		
		return enderecoRepository.save(endereco);
	}
}
