package com.dc.spring.docker.gradle.controller;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateTimeController {
	@GetMapping(value="/timestamp")
	public LocalTime getDate() {
		return LocalTime.now();
	}
}
