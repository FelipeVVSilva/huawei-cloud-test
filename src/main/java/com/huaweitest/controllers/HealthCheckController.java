package com.huaweitest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HealthCheckController {

	@GetMapping("/")
	public ResponseEntity<String> teste(){
		return ResponseEntity.ok("teste ok");
	}
	
}
