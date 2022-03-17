package br.com.roroapiproject.api.Controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController         //Annotations responsable por la ruta/control, para trabajar con ApiRest
public class Controle {
	
	@GetMapping("") //Annotations responsable de mostrar un resultado ( texto, numero o mostrar html)
	public String mensagem() {
		
		return "Hello World!";
	}
	

}
