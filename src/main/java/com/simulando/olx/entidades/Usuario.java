package com.simulando.olx.entidades;

import javax.persistence.Basic;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.simulando.olx.entidadesConverter.EnumSexoConverter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="USUARIO")
public class Usuario extends AbstractEntity{
	
	private static final long serialVersionUID = 1L;

	private String nome;

	private String apelido;

	@Enumerated(EnumType.ORDINAL)
	private EnumTipo tipo;
	
	@Basic
	@Convert(converter = EnumSexoConverter.class)
	private EnumSexo sexo;

	private String cpf;

	private String email;

	private String telefone;

//	private Endereco endereco;

}
