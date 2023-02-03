package com.attornatus.project.domain.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.attornatus.project.domain.model.Endereco;
import com.attornatus.project.domain.model.Pessoa;
import com.attornatus.project.domain.model.TipoEndereco;
import com.attornatus.project.domain.repository.EnderecoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CadastroEnderecoService {

	private CadastroPessoaService pessoaService;
	private EnderecoRepository enderecoRepository;
	
	
	@Transactional
	public Endereco cadastrar(Endereco endereco) {
		
		Pessoa pessoa = pessoaService.buscar(endereco.getPessoa().getId());
		
		endereco.setPessoa(pessoa);
		
		if(endereco.getTipoEndereco() != null) {
			endereco.setTipoEndereco(TipoEndereco.PRINCIPAL);
		} else {
			endereco.setTipoEndereco(TipoEndereco.PADRÃO);
		}
		
		return enderecoRepository.save(endereco);
	}
	

}
