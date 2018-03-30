package com.simulando.olx.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="CATEGORIA")
public class Categoria extends AbstractEntity{

	private static final long serialVersionUID = 1L;

	private String nome;

	@OneToMany
	@JoinColumn(name = "idCategoriaPai", updatable = false)
	private List<Categoria> subCategorias;

	@ManyToOne
	@JoinColumn(name = "idCategoriaPai", nullable = true)
	private Categoria categoriaPai;

}
