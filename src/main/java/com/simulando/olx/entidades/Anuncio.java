package com.simulando.olx.entidades;

import lombok.Data;

@Data
public class Anuncio {

	private String titulo;

	private String descricao;

	private Boolean ocultarTelefoneNoAnuncio;

	private String CEP;

	private Categoria categoria;

	private Usuario usuario;

}
