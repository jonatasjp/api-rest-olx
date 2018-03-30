package com.simulando.olx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simulando.olx.entities.Anuncio;
import com.simulando.olx.exception.ConstantesException;
import com.simulando.olx.exception.DefaultException;
import com.simulando.olx.repository.AnuncioRepository;

@Service
public class AnuncioService {

	@Autowired
	private AnuncioRepository anuncioRepository;
	
	@Transactional(rollbackFor = Exception.class)
	public Anuncio cadastrarAnuncio(Anuncio anuncio) {
		return anuncioRepository.save(anuncio);
	}
	
	public Anuncio buscarAnuncio(Long id) {
		Optional<Anuncio> anuncio = anuncioRepository.findById(id);
		
		if(!anuncio.isPresent()) {
			throw new DefaultException(ConstantesException.ANUNCIO_NAO_ENCONTRADO);
		}
		return anuncio.get();
	}

	public List<Anuncio> buscarAnuncios() {
		return anuncioRepository.findAll();
	}

	public void removerAnuncio(Long id) {
		anuncioRepository.deleteById(id);
	}

	@Transactional(rollbackFor = Exception.class)
	public Anuncio atualizarAnuncio(Anuncio anuncio) {
		return anuncioRepository.save(anuncio);
	}

	public List<Anuncio> buscarAnuncioPorNome(String nome) {
		List<Anuncio> anuncios = 
				anuncioRepository.findByTituloIgnoreCaseContainingOrDescricaoIgnoreCaseContaining(nome, nome);
		
		if(anuncios == null || anuncios.isEmpty()){
			throw new DefaultException(ConstantesException.ANUNCIO_NAO_ENCONTRADO);
		}
		
		return anuncioRepository.findByTituloIgnoreCaseContainingOrDescricaoIgnoreCaseContaining(nome, nome);
	}
	
}
