package com.simulando.olx.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ExceptionDetail {

	private Long timestamp;
	private Integer status;
	private String titulo;
	private String detalhe;

}
