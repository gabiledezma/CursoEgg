package com.perrosv1.app.controladores;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller 
@RequestMapping("/") //localhost:8080/
public class MainController {
	

	@GetMapping("/")//localhost:8080/
	public String index() {

	return "index";
	}
	
}
