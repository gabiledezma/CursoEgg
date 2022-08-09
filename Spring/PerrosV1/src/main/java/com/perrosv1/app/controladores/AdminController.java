package com.perrosv1.app.controladores;

import com.perrosv1.app.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UsuarioService us;

    @GetMapping("/")
    public String dashboard(ModelMap model) {
        model.put("usuarios", us.findAll());
        return "admin-dashboard";
    }

    @GetMapping("/role/{id}")
    public String cambiarRol(ModelMap modelo, @PathVariable String id) {
        try {
            us.cambiarRol(id);
            modelo.put("", id);
        } catch (Exception e) {
        }
        return "redirect:/admin/";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable String id){
        try {
            us.eliminarUsuario(id);
        } catch (Exception e) {
            
        }
        return "redirect:/admin/";
    }

}
