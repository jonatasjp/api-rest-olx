package com.simulando.olx.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simulando.olx.custom.CustomErrorType;
import com.simulando.olx.entidades.Anuncio;

@RestController
@RequestMapping("anuncios")
public class AnunciosController {

	@GetMapping
	public ResponseEntity<?> buscarAnuncios(){
		return ResponseEntity.ok(Anuncio.bancoDeAnuncios());
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<?> buscarAnuncio(@PathVariable Integer id){
		
		if(id == null || id < 0 || id >= Anuncio.bancoDeAnuncios().size()) {
			return new ResponseEntity<>(new CustomErrorType("ID inválido"), 
					HttpStatus.NOT_FOUND);
		}
		
		return ResponseEntity.ok(Anuncio.bancoDeAnuncios().get(id));
	}

	@PostMapping
	public ResponseEntity<?> cadastrarAnuncio(@RequestBody Anuncio anuncio){
		return ResponseEntity.ok("Anuncio cadastrado com sucesso!");
	}

	@DeleteMapping
	public ResponseEntity<?> removerAnuncio(@RequestBody Anuncio anuncio){
		return ResponseEntity.ok("Anuncio removido com sucesso!");
	}
	
	@PutMapping
	public ResponseEntity<?> atualizarAnuncio(@RequestBody Anuncio anuncio){
		return ResponseEntity.ok("Anuncio alterado com sucesso!");
	}
}
