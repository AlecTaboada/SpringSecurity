package com.example.demo.clinica.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class InicioController {
	@GetMapping("/")
	public String mostrarInicio() {
		return "log";
	}
}
