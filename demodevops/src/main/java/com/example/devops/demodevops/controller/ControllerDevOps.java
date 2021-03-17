package com.example.devops.demodevops.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDevOps {

	@RequestMapping("/")
	public String index() {
		return "Welcome to Devops Controller";
	}
	
}
