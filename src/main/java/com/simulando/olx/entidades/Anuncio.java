package com.simulando.olx.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ANUNCIO")
public class Anuncio extends AbstractEntity{

	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String titulo;
	
	@NotEmpty
	private String descricao;

	@Column(name="ocultartelefone")
	private Boolean ocultarTelefoneNoAnuncio;

//	private Categoria categoria;
//
//	private Usuario usuario;

}
