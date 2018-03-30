package com.simulando.olx.entities;

import com.simulando.olx.exception.ConstantesException;
import com.simulando.olx.exception.DefaultException;

import lombok.Getter;

public enum EnumSexo {

	MASCULINO('M'), FEMININO('F');

	@Getter
	private final char sexo;

	private EnumSexo(char sexo) {
		this.sexo = sexo;
	}

	public static EnumSexo getEnumPeloValor(char sexo) {
		if ( sexo == 'M' || sexo == 'm' ) {
			return MASCULINO;
		}
		if ( sexo == 'F' || sexo == 'f' ) {
			return FEMININO;
		}
		
		throw new DefaultException(ConstantesException.SEXO_INVALIDO);
	}
}
