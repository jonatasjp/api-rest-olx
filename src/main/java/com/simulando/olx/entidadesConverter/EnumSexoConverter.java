package com.simulando.olx.entidadesConverter;

import javax.persistence.AttributeConverter;

import com.simulando.olx.entidades.EnumSexo;

public class EnumSexoConverter implements AttributeConverter<EnumSexo, Character> {

	@Override
	public Character convertToDatabaseColumn(EnumSexo sexo) {
		if ( sexo == null ) {
			return null;
		}

		return sexo.getSexo();
	}

	@Override
	public EnumSexo convertToEntityAttribute(Character sexo) {
		if ( sexo == null ) {
			return null;
		}

		return EnumSexo.getEnumPeloValor(sexo);
	}

}
