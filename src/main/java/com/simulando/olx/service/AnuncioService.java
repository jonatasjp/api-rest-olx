package com.simulando.olx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulando.olx.entidades.Anuncio;
import com.simulando.olx.repository.AnuncioRepository;

@Service
public class AnuncioService {

	@Autowired
	private AnuncioRepository anuncioRepository;
	
	public Anuncio cadastrarAnuncio(Anuncio anuncio) {
		return anuncioRepository.save(anuncio);
	}
	
	public Anuncio buscarAnuncio(Long id) {
		Optional<Anuncio> anuncio = anuncioRepository.findById(id);
		
		if(!anuncio.isPresent()) {
//			return new ResponseEntity<>(
//					new CustomErrorType("ID inválido"), HttpStatus.NOT_FOUND);
			throw new RuntimeException();
		}
		return anuncio.get();
	}

	public List<Anuncio> buscarAnuncios() {
		return anuncioRepository.findAll();
	}

	public void removerAnuncio(Long id) {
		anuncioRepository.deleteById(id);
	}

	public Anuncio atualizarAnuncio(Anuncio anuncio) {
		return anuncioRepository.save(anuncio);
	}

	public List<Anuncio> buscarAnuncioPorNome(String nome) {
		return anuncioRepository.findByTituloIgnoreCaseContainingOrDescricaoIgnoreCaseContaining(nome, nome);
	}
	
}
