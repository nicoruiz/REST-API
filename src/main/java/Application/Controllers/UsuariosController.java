package Application.Controllers;

import Application.Domain.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosController {
    @RequestMapping("/Usuarios")
    public Usuario getUsuario() {
        return new Usuario(1, "Nico");
    }
}
