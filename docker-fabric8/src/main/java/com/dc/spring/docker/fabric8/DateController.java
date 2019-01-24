package com.dc.spring.docker.fabric8;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

	@GetMapping(value="/date")
	public ResponseEntity<String> getDate() {
		String response = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		return ResponseEntity.ok(response);
	} 
}
