package com.simulando.olx.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {
	
	@PostMapping(consumes = "application/json")
	public ResponseEntity<?> login(){
		//TODO realizar login
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
