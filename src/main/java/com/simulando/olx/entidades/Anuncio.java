package com.simulando.olx.entidades;

public class Anuncio {

	private String titulo;

	private String descricao;

	private Boolean ocultarTelefoneNoAnuncio;

	private String CEP;

	private Categoria categoria;

	private Usuario usuario;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getOcultarTelefoneNoAnuncio() {
		return ocultarTelefoneNoAnuncio;
	}

	public void setOcultarTelefoneNoAnuncio(Boolean ocultarTelefoneNoAnuncio) {
		this.ocultarTelefoneNoAnuncio = ocultarTelefoneNoAnuncio;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
