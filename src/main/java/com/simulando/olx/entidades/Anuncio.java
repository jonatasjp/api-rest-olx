package com.simulando.olx.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ANUNCIO")
public class Anuncio extends AbstractEntity{

	private static final long serialVersionUID = 1L;
	
	private String titulo;

	private String descricao;

	private Boolean ocultarTelefoneNoAnuncio;

//	private Categoria categoria;
//
//	private Usuario usuario;

	public static List<Anuncio> bancoDeAnuncios() {
		
		List<Anuncio> anuncios = new ArrayList<>(	);
		
		Anuncio anuncio = new Anuncio();
		anuncio.setDescricao("desc");
		anuncio.setOcultarTelefoneNoAnuncio(true);
		anuncio.setTitulo("titulo");
		
		Anuncio anuncio2 = new Anuncio();
		anuncio2.setDescricao("desc1");
		anuncio2.setOcultarTelefoneNoAnuncio(true);
		anuncio2.setTitulo("titulo1");
		
		Anuncio anuncio3 = new Anuncio();
		anuncio3.setDescricao("desc2");
		anuncio3.setOcultarTelefoneNoAnuncio(true);
		anuncio3.setTitulo("titulo2");
		
		Anuncio anuncio4 = new Anuncio();
		anuncio4.setDescricao("desc3");
		anuncio4.setOcultarTelefoneNoAnuncio(true);
		anuncio4.setTitulo("titulo3");
		
		anuncios.add(anuncio);
		anuncios.add(anuncio2);
		anuncios.add(anuncio3);
		anuncios.add(anuncio4);
		
		return anuncios;
	}

}
