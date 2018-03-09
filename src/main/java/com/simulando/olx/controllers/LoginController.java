package com.simulando.olx.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="login")
public class LoginController {
	
	@GetMapping
	public String olaMundo(){
		return "olá mundo";
	}
}
