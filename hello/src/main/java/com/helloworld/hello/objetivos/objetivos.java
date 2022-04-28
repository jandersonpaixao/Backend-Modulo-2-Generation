package com.helloworld.hello.objetivos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class objetivos {
	
	@GetMapping
	public String objetivos() {
		return "\nAprender e desenvolver o DER do Projeto Integrador e do Blog Pessoal;\nSer introduzido ao Spring Boot.";
	}

}
