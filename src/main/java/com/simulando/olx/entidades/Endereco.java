package com.simulando.olx.entidades;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ENDERECO")
public class Endereco extends AbstractEntity{

	private static final long serialVersionUID = 1L;

	private String CEP;

	private String endereco;

	private String numero;

	private String complemento;

	private String bairro;

	@ManyToOne
	@JoinColumn(name="idEstado")
	private Estado estado;

}
