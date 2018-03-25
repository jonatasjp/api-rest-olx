package com.simulando.olx.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;

@ResponseStatus(HttpStatus.NOT_FOUND)
@Getter
public class DefaultException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private ConstantesException constanteException;
	
	public DefaultException(ConstantesException constanteException) {
		this.constanteException = constanteException;
	}
	
}
