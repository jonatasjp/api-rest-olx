package com.simulando.olx.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DefaultDetail {

	protected Long timestamp;
	protected Integer status;
	protected String titulo;
	protected String detalhe;
	protected String URL;
	
}
