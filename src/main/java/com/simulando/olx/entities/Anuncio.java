package com.simulando.olx.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name = "idCategoria", nullable = false)
	private Categoria categoria;

	@ManyToOne
	@JoinColumn(name = "idUsuario", nullable = false)
	private Usuario usuario;

}
