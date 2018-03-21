package com.simulando.olx.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simulando.olx.entidades.Anuncio;

@Repository
public interface AnuncioRepository extends CrudRepository<Anuncio, Long>{

}
