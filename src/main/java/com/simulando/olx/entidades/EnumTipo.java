package com.simulando.olx.entidades;

public enum EnumTipo {
	
	PARTICULAR(1, "Particular"), 
	PROFISSIONAL(2, "Profissional");
	
	private Integer codigo;
	private String nome;
	
	private EnumTipo(Integer codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

}
