package LibreriaWeb.DonPepe.controladores;

import LibreriaWeb.DonPepe.entidades.Editorial;
import LibreriaWeb.DonPepe.servicios.ServicioEditorial;
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
@RequestMapping("/editorial")
public class ControladorEditorial {

    @Autowired
    private ServicioEditorial se;

    
    
    
    @GetMapping("/registro")
    public String formulario() {
        return "form-editorial";
    }

    @PostMapping("/registro")
    public String guardar(ModelMap modelo, @RequestParam String nombre) {

        try {
            se.guardar(nombre);

            modelo.put("exito", "Registro exitoso.");

            return "form-editorial";

        } catch (Exception e) {

            modelo.put("error", "Faltó algún dato.");
            return "form-editorial";
        }
    }

    @GetMapping("/modificar/{id}") //PATHVARIABLE
    public String modificar(@PathVariable String id, ModelMap modelo) {

        modelo.put("editorial", se.getOne(id));

        return "form-editorial-modif";
    }

    @PostMapping("/modificar/{id}")
    public String modificar(ModelMap modelo, @PathVariable String id, @RequestParam String nombre) {

        try {
            se.modificar(id, nombre);

            return "redirect:/editorial/lista";
        } catch (Exception e) {
            modelo.put("error", "Faltó algún dato.");
            modelo.put("editorial", se.getOne(id));
            return "form-editorial-modif";
        }
    }

    @GetMapping("/lista")
    public String lista(ModelMap modelo) {

        List<Editorial> editorialesLista = se.listarTodos();

        modelo.addAttribute("editoriales", editorialesLista);

        return "list-editorial";
    }

    @GetMapping("/baja/{id}")
    public String baja(@PathVariable String id) {

        try {
            se.baja(id);
            return "redirect:/editorial/lista";
        } catch (Exception e) {
            return "redirect:/";
        }

    }

    @GetMapping("/alta/{id}")
    public String alta(@PathVariable String id) {

        try {
            se.alta(id);
            return "redirect:/editorial/lista";
        } catch (Exception e) {
            return "redirect:/";
        }
    }

}
