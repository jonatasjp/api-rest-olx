package com.simulando.olx.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ConstantesException {

	private String titulo;
	private HttpStatus status;
	private String mensagem;
	
	public static ConstantesException ANUNCIO_NAO_ENCONTRADO = 
			new ConstantesException("Recurso não encontrado", HttpStatus.NOT_FOUND, "ANUNCIO_NAO_ENCONTRADO");
	
	
}
