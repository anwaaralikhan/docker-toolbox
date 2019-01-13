package com.dc.spring.docker.spotify.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping(value="/beep")
	public ResponseEntity<String> beep() {
		String respone = "Hello " + new Date();
		return new ResponseEntity<>(respone, HttpStatus.OK);		
	}
}
