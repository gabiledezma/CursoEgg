package LibreriaWeb.DonPepe.controladores;

import LibreriaWeb.DonPepe.entidades.Autor;
import LibreriaWeb.DonPepe.servicios.ServicioAutor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/autor")
public class ControladorAutor {

    @Autowired
    private ServicioAutor sa;

    
    
    
    
    @GetMapping("/registro")
    public String formulario() {
        return "form-autor";
    }

    @PostMapping("/registro")
    public String guardar(ModelMap modelo, @RequestParam String nombre) {

        try {
            sa.guardar(nombre);

            modelo.put("exito", "Registro exitoso.");

            return "form-autor";

        } catch (Exception e) {

            modelo.put("error", "Faltó algún dato.");
            return "form-autor";
        }
    }

    @GetMapping("/modificar/{id}") //PATHVARIABLE
    public String modificar(@PathVariable String id, ModelMap modelo) {

        modelo.put("autor", sa.getOne(id));

        return "form-autor-modif";
    }

    @PostMapping("/modificar/{id}")
    public String modificar(ModelMap modelo, @PathVariable String id, @RequestParam String nombre) {

        try {
            sa.modificar(id, nombre);

            return "redirect:/autor/lista";
        } catch (Exception e) {
            modelo.put("error", "Faltó algún dato.");
            modelo.put("autor", sa.getOne(id));
            return "form-autor-modif";
        }
    }

    @GetMapping("/lista")
    public String lista(ModelMap modelo) {

        List<Autor> autoresLista = sa.listarTodos();

        modelo.addAttribute("autores", autoresLista);

        return "list-autor";
    }

    @GetMapping("/baja/{id}")
    public String baja(@PathVariable String id) {

        try {
            sa.baja(id);
            return "redirect:/autor/lista";
        } catch (Exception e) {
            return "redirect:/";
        }

    }

    @GetMapping("/alta/{id}")
    public String alta(@PathVariable String id) {

        try {
            sa.alta(id);
            return "redirect:/autor/lista";
        } catch (Exception e) {
            return "redirect:/";
        }
    }
}
