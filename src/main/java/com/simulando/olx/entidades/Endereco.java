package com.simulando.olx.entidades;

import lombok.Data;

@Data
public class Endereco {

	private String CEP;

	private String endereco;

	private String numero;

	private String complemento;

	private String bairro;

	private Estado estado;

}
