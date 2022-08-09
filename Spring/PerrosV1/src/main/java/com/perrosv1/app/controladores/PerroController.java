package com.perrosv1.app.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.perrosv1.app.entidades.Perro;
import com.perrosv1.app.entidades.Usuario;
import com.perrosv1.app.servicios.NotificacionService;
import com.perrosv1.app.servicios.PerroService;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/perro") //localhost:8080/perro
public class PerroController {

    @Autowired
    private PerroService perroService;

    //@Autowired
    //private NotificacionService ns;

    @GetMapping("/registro") //localhost:8080/perro/registro
    public String formulario() {

        return "form-perro";
    }

    @PostMapping("/registro")
    public String guardar(ModelMap modelo, @RequestParam String nombre, @RequestParam String apodo, @RequestParam String foto, @RequestParam String raza, HttpSession session) {

        try {
            Usuario u = (Usuario) session.getAttribute("usuariosession");
            Perro p = perroService.guardar(nombre, apodo, foto, raza, u.getId());
            //ns.registroModificacionPerro(p, u, "Bienvenido a la app de perros \n \n mail: " + u.getEmail() + " su perro fue cargado correctamente"
            //        + "\n \n Perro: " + p.getNombre() + "\n Apodo: " + p.getApodo() + "\n Raza: " + p.getRaza(), "Registro Perro");
            modelo.put("exito", "Registro exitoso");

            return "form-perro";

        } catch (Exception e) {
            System.out.println(e.getMessage());
            modelo.put("error", "Falto algun dato");
            return "form-perro";
        }
    }

    @GetMapping("/modificar/{id}") //PATHVARIABLE
    public String modificar(@PathVariable String id, ModelMap modelo) {

        modelo.put("perro", perroService.getOne(id));

        return "form-perro-modif";
    }

    @PostMapping("/modificar/{id}")
    public String modificar(ModelMap modelo, @PathVariable String id, @RequestParam String nombre, @RequestParam String apodo, @RequestParam String foto, @RequestParam String raza) {

        try {
            Perro p = perroService.modificar(id, nombre, apodo, foto, raza);
            //ns.registroModificacionPerro(p, u, "Bienvenido a la app de perros \n \n mail: " + u.getEmail() + " su perro fue modificado correctamente"
            //        + "\n \n Perro: " + p.getNombre() + "\n Apodo: " + p.getApodo() + "\n Raza: " + p.getRaza(), "Modificacion Perro");
            modelo.put("exito", "Modificacion exitosa");

            return "redirect:/perro/lista";
        } catch (Exception e) {
            modelo.put("error", "Falto algun dato");
            modelo.put("perro", perroService.getOne(id));
            return "form-perro-modif";
        }
    }

    @GetMapping("/lista")
    public String lista(ModelMap modelo, HttpSession session) {

        Usuario u = (Usuario) session.getAttribute("usuariosession");
        List<Perro> perrosLista = perroService.findByUser(u.getId());

        modelo.addAttribute("perros", perrosLista);

        return "list-perro";
    }

    @GetMapping("/baja/{id}")
    public String baja(@PathVariable String id) {

        try {
            perroService.baja(id);
            return "redirect:/perro/lista";
        } catch (Exception e) {
            return "redirect:/";
        }

    }

    @GetMapping("/alta/{id}")
    public String alta(@PathVariable String id) {

        try {
            perroService.alta(id);
            return "redirect:/perro/lista";
        } catch (Exception e) {
            return "redirect:/";
        }
    }
    

}
