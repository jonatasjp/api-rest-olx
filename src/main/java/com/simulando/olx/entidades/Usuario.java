package com.simulando.olx.entidades;

import lombok.Data;

@Data
public class Usuario {
	
	private String nome;

	private String apelido;

	private EnumTipo tipo;

	private Character sexo;

	private String cpf;

	private String email;

	private String telefone;

	private Endereco endereco;

}
