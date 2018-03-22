package com.simulando.olx.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.simulando.olx.repository.AnuncioRepository;

@RestController
@RequestMapping("anuncios")
public class AnunciosController {
	
	@Autowired
	private AnuncioRepository anuncioRepository;

	@GetMapping
	public ResponseEntity<?> buscarAnuncios(){
		return ResponseEntity.ok(anuncioRepository.findAll());
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<?> buscarAnuncio(@PathVariable Long id){
		
		Optional<Anuncio> anuncio = anuncioRepository.findById(id);
		
		if(!anuncio.isPresent()) {
			return new ResponseEntity<>(
					new CustomErrorType("ID inválido"), HttpStatus.NOT_FOUND);
		}
		
		return ResponseEntity.ok(anuncio.get());
	}

	@PostMapping
	public ResponseEntity<?> cadastrarAnuncio(@RequestBody Anuncio anuncio){
		
		Anuncio anuncioCadastrado = anuncioRepository.save(anuncio);
		
		return ResponseEntity.ok(anuncioCadastrado);
	}

	@DeleteMapping
	public ResponseEntity<?> removerAnuncio(@PathVariable Long id){
		
		anuncioRepository.deleteById(id);
		return ResponseEntity.ok("Anuncio removido com sucesso");
	}
	
	@PutMapping
	public ResponseEntity<?> atualizarAnuncio(@RequestBody Anuncio anuncio){
		
		Anuncio anuncioAtualizado = anuncioRepository.save(anuncio);
		return ResponseEntity.ok(anuncioAtualizado);
	}
}
