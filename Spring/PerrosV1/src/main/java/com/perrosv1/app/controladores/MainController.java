package com.perrosv1.app.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/") //localhost:8080/
public class MainController {

    @GetMapping("/")//localhost:8080/
    public String index(@RequestParam(required = false)String login, ModelMap model) {
        if (login!=null) {
            model.put("exito","Logueado con exito");
        }
        return "index";
    }
    
    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, @RequestParam(required = false) String logout, ModelMap model){
        if (error != null) {
            model.put("error", "Usuario o Contraseña incorrectos");
        }
        if (logout != null) {
            model.put("logout","Desconectado correctamente");
        }
        return "login";
    }

}
