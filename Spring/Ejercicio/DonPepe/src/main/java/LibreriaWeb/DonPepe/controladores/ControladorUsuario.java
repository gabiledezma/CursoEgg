package LibreriaWeb.DonPepe.controladores;

import LibreriaWeb.DonPepe.servicios.ServicioUsuario;
import LibreriaWeb.DonPepe.entidades.Usuario;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/usuario")
public class ControladorUsuario {

    @Autowired
    private ServicioUsuario su;

    @GetMapping("/registro")
    public String registrarse() {
        return "registro";
    }

    @PostMapping("/registro")
    public String guardarUsuario(@RequestParam String email, @RequestParam String pw1, @RequestParam String pw2) {
        try {

            Usuario u = su.crearUsuario(email, pw1, pw2);
            //ns.registroModificacionUsuario(u, "¡Bienvenido a la app de perros! \n \n mail: "+u.getEmail()+" \n \n Ya puede comenzar a utlizar nuestra app", "Registro Usuario");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "redirect:/login";
    }

    @GetMapping("/editar")
    public String editar(ModelMap model, HttpSession session) {
        try {
            Usuario u = (Usuario) session.getAttribute("usuariosession");
            model.put("usuario", u);
        } catch (Exception e) {
        }

        return "editar-perfil";

    }

    @PostMapping("/editar")
    public String editarPerfil(@RequestParam String id, @RequestParam String email, @RequestParam String pw1, @RequestParam String pw2, RedirectAttributes redirectAttributes, ModelMap model) {
        try {
            Usuario u = su.modificarUsuario(id, email, pw1, pw2);
            //ns.registroModificacionUsuario(u, "¡Bienvenido a la app de perros! \n \n mail: "+u.getEmail()+" \n \n Usuario modificado correctamente", "Modificacion Usuario");
            model.put("exito", "Usuario modificado con exito");
            redirectAttributes.addFlashAttribute("exito", "Usuario modificado con exito");
        } catch (Exception e) {
            model.put("error", e.getMessage());
            redirectAttributes.addFlashAttribute("error", e.getMessage());
        }
        return "redirect:/usuario/editar";
    }
}
