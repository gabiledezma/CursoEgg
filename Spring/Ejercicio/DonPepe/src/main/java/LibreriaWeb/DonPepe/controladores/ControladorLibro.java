package LibreriaWeb.DonPepe.controladores;

import LibreriaWeb.DonPepe.entidades.Autor;
import LibreriaWeb.DonPepe.entidades.Editorial;
import LibreriaWeb.DonPepe.entidades.Libro;
import LibreriaWeb.DonPepe.servicios.ServicioAutor;
import LibreriaWeb.DonPepe.servicios.ServicioEditorial;
import LibreriaWeb.DonPepe.servicios.ServicioLibro;
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
@RequestMapping("/libro")
public class ControladorLibro {

    @Autowired
    private ServicioLibro sl;
    @Autowired
    private ServicioAutor sa;
    @Autowired
    private ServicioEditorial se;

    @GetMapping("/registro")
    public String formulario(ModelMap modelo) {
        
        modelo.put("autores", sa.listarTodos());
        modelo.put("editoriales", se.listarTodos());
        return "form-libro";
    }

    @PostMapping("/registro")
    public String guardar(ModelMap modelo, @RequestParam Long isbn, @RequestParam String titulo, @RequestParam Integer anio, @RequestParam Integer ejemplares, @RequestParam Integer ejemplaresPrestados, @RequestParam Integer ejemplaresRestantes, @RequestParam String autor, @RequestParam String editorial) {

        try {
            sl.guardar(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, autor, editorial); //Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes

            modelo.put("autores", sa.listarTodos());
            modelo.put("editoriales", se.listarTodos());
            modelo.put("exito", "Registro exitoso.");
            return "form-libro";
        } catch (Exception e) {
            modelo.put("autores", sa.listarTodos());
            modelo.put("editoriales", se.listarTodos());
            modelo.put("error", "Faltó algún dato.");
            return "form-libro";
        }
    }

    @GetMapping("/modificar/{id}") //PATHVARIABLE
    public String modificar(@PathVariable String id, ModelMap modelo) {

        modelo.put("libro", sl.getOne(id));
        modelo.put("autores", sa.listarTodos());
        modelo.put("editoriales", se.listarTodos());
        return "form-libro-modif";
    }
// posible error al modificar autor y editorial

    @PostMapping("/modificar/{id}")
    public String modificar(ModelMap modelo, @PathVariable String id, @RequestParam Long isbn, @RequestParam String titulo, @RequestParam Integer anio, @RequestParam Integer ejemplares, @RequestParam Integer ejemplaresPrestados, @RequestParam Integer ejemplaresRestantes, @RequestParam String autor, @RequestParam String editorial) {

        try {
            sl.modificar(id, isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, autor, editorial);
            modelo.put("autores", sa.listarTodos());
            modelo.put("editoriales", se.listarTodos());
            return "redirect:/libro/lista";
        } catch (Exception e) {
            modelo.put("libro", sl.getOne(id));
            modelo.put("autores", sa.listarTodos());
            modelo.put("editoriales", se.listarTodos());
            modelo.put("error", "Faltó algún dato.");
            return "form-libro-modif";
        }
    }

    @GetMapping("/lista")
    public String lista(ModelMap modelo) {

        modelo.addAttribute("libros", sl.listarTodos());

        return "list-libro";
    }

    @GetMapping("/baja/{id}")
    public String baja(@PathVariable String id) {

        try {
            sl.baja(id);
            return "redirect:/libro/lista";
        } catch (Exception e) {
            return "redirect:/";
        }

    }

    @GetMapping("/alta/{id}")
    public String alta(@PathVariable String id) {

        try {
            sl.alta(id);
            return "redirect:/libro/lista";
        } catch (Exception e) {
            return "redirect:/";
        }
    }
}
