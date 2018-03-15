package com.simulando.olx.entidades;

import lombok.Data;

@Data
public class Categoria {

	private String nome;

	private Categoria subCategoria;

	private Categoria categoriaPai;

}
