package com.attornatus.project.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.attornatus.project.domain.model.Endereco;
import com.attornatus.project.domain.model.Pessoa;
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	List<Endereco> findAllByPessoaId(Long id);
}
