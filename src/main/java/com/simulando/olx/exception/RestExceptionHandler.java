package com.simulando.olx.exception;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

	@Autowired
	private ReadMessages readMessages;
	
	@ExceptionHandler(value=DefaultException.class)
	public ResponseEntity<?> handle(DefaultException exception) {
		
		ExceptionDetail exceptionDetail = ExceptionDetail
				.builder()
				.timestamp(new Date().getTime())
				.titulo(exception.getConstanteException().getTitulo())
				.detalhe(readMessages.getPropertie(exception.getConstanteException().getMensagem()))
				.status(exception.getConstanteException().getStatus().value())
				.build();
		
		return new ResponseEntity<>(exceptionDetail, exception.getConstanteException().getStatus());
	}
}
