package com.simulando.olx.exception;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ValidationErrorDetail extends DefaultDetail {

	private List<ValidationDetail> validacoes;

	@Builder
	public ValidationErrorDetail(Long timestamp, Integer status, 
			String titulo, String detalhe, String URL, List<ValidationDetail> validacoes) {
		super(timestamp, status, titulo, detalhe, URL);
		this.validacoes = validacoes;
	}
	

}
