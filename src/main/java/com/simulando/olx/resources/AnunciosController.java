package com.simulando.olx.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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

import com.simulando.olx.entities.Anuncio;
import com.simulando.olx.service.AnuncioService;

@RestController
@RequestMapping("anuncios")
public class AnunciosController {
	
	@Autowired
	private AnuncioService anuncioService;

	@GetMapping
	public ResponseEntity<?> buscarAnuncios(Pageable pageable){
		return ResponseEntity.ok(anuncioService.buscarAnuncios(pageable));
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<?> buscarAnuncio(@PathVariable Long id){
		Anuncio anuncio = anuncioService.buscarAnuncio(id);
		return ResponseEntity.ok(anuncio);
	}
	
	@GetMapping(path="/nome/{nome}")
	public ResponseEntity<?> buscarAnunciosPorNome(@PathVariable String nome){
		List<Anuncio> anuncios = anuncioService.buscarAnuncioPorNome(nome);
		return ResponseEntity.ok(anuncios);
	}

	@PostMapping
	public ResponseEntity<?> cadastrarAnuncio(@Valid @RequestBody Anuncio anuncio){
		Anuncio anuncioCadastrado = anuncioService.cadastrarAnuncio(anuncio);
		return new ResponseEntity<>(anuncioCadastrado, HttpStatus.CREATED);
	}

	@DeleteMapping
	public ResponseEntity<?> removerAnuncio(@PathVariable Long id){
		anuncioService.removerAnuncio(id);
		return ResponseEntity.ok("Anuncio removido com sucesso");
	}
	
	@PutMapping
	public ResponseEntity<?> atualizarAnuncio(@RequestBody Anuncio anuncio){
		Anuncio anuncioAtualizado = anuncioService.atualizarAnuncio(anuncio);
		return ResponseEntity.ok(anuncioAtualizado);
	}
}
