package com.simulando.olx.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simulando.olx.entidades.Anuncio;

@RestController
@RequestMapping("anuncios")
public class AnunciosController {

	@GetMapping
	public ResponseEntity<?> buscarAnuncios(){
		
		Anuncio anuncio = new Anuncio();
		anuncio.setCEP("58075440");
		anuncio.setDescricao("desc");
		anuncio.setOcultarTelefoneNoAnuncio(true);
		anuncio.setTitulo("titulo");
		
		return new ResponseEntity<>(anuncio, HttpStatus.OK);
	}
}
