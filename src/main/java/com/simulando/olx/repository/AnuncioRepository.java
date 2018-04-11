package com.simulando.olx.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.simulando.olx.entities.Anuncio;

@Repository
public interface AnuncioRepository extends PagingAndSortingRepository<Anuncio, Long>{
	
	Page<Anuncio> findAll(Pageable pageable);
	
	List<Anuncio> findAll(Sort sort);
	
	List<Anuncio> findByTituloIgnoreCaseContainingOrDescricaoIgnoreCaseContaining(String titulo, String descricao);
}
