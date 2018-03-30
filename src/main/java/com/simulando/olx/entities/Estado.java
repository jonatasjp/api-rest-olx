package com.simulando.olx.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ESTADO")
public class Estado extends AbstractEntity{

	private static final long serialVersionUID = 1L;

	private String nome;

	private String sigla;

	private String regiao;

}