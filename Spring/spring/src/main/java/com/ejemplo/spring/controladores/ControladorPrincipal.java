package com.ejemplo.spring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")//http://localhost:8080
public class ControladorPrincipal {

    @GetMapping
    public String index() {
        return "index.html";
    }
}
