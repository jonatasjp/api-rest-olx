package com.simulando.olx.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:mensagensException.properties")
public class ReadMessages {

	@Autowired
	private Environment env;

	public String getPropertie(String propertie) {
		return env.getProperty(propertie);
	}
}
