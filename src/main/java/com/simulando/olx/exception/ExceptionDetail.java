package com.simulando.olx.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ExceptionDetail extends DefaultDetail{

	@Builder
	public ExceptionDetail(Long timestamp, Integer status, String titulo, String detalhe, String URL) {
		super(timestamp, status, titulo, detalhe, URL);
	}

}
