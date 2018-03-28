package com.simulando.olx.exception;

import lombok.Getter;

@Getter
public class DefaultException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private ConstantesException constanteException;
	
	public DefaultException(ConstantesException constanteException) {
		this.constanteException = constanteException;
	}
	
}
