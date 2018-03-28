package com.simulando.olx.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ANUNCIO")
public class Anuncio extends AbstractEntity{

	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message="O campo titulo é obrigatório")
	private String titulo;
	
	@NotEmpty(message="O campo descrição é obrigatório")
	private String descricao;

	@Column(name="ocultartelefone")
	private Boolean ocultarTelefoneNoAnuncio;

//	private Categoria categoria;
//
//	private Usuario usuario;

}
