package com.simulando.olx.exception;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidationDetail implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String campo;
	private String mensagemDeErro;
	
}
