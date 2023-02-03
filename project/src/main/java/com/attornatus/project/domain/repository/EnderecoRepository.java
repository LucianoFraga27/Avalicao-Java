package com.attornatus.project.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.attornatus.project.domain.model.Endereco;
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	
}
