package br.com.petz.clientepet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClientepetApplication {
	@GetMapping
	public String getHomeTeste() {
		return "Cadastro de Clientes";
	}
	public static void main(String[] args) {
		SpringApplication.run(ClientepetApplication.class, args);
	}

}
