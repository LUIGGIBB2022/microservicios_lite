package com.holamundo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EjercicioHolaMundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioHolaMundoApplication.class, args);
	}

	@GetMapping("/")
	public String hello(@RequestParam(value = "name", defaultValue = "Mundo") String name) {
		return String.format("Hola mi nombre es %s!", name);
	}

}
