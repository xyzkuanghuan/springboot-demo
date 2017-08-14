package com.xyz.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class IndexController {
	
	@GetMapping(value = "/index")
	public String index() {
		return "Hello spring boot Index";
	}
	
	@GetMapping(value = "/token")
	public String token() {
		return "Hello spring boot token";
	}

}
