package com.simulando.olx.entidades;

public class Categoria {

	private String nome;

	private Categoria subCategoria;

	private Categoria categoriaPai;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(Categoria subCategoria) {
		this.subCategoria = subCategoria;
	}

	public Categoria getCategoriaPai() {
		return categoriaPai;
	}

	public void setCategoriaPai(Categoria categoriaPai) {
		this.categoriaPai = categoriaPai;
	}

}
