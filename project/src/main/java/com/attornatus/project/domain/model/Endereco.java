package com.attornatus.project.domain.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Endereco {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String logradouro;
	private	String cep;
	private String numero;
	private String cidade;
	
	@ManyToOne
	@JoinColumn(name="pessoa_id",nullable=false)
	private Pessoa pessoa;
	
	@Enumerated(EnumType.STRING)
	private TipoEndereco principal;
}
