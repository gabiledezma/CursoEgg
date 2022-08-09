package com.perrosv1.app.servicios;

import com.perrosv1.app.entidades.Perro;
import com.perrosv1.app.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificacionService {

    @Autowired
    private JavaMailSender mailSender;
    
    @Autowired
    private UsuarioService us;

    @Async
    public void registroModificacionPerro(Perro p, Usuario c, String msj,String asunto ) {
        SimpleMailMessage mensaje = new SimpleMailMessage();
        mensaje.setTo(c.getEmail());
        mensaje.setFrom("eggmza4000@gmail.com");
        mensaje.setSubject(asunto);
        mensaje.setText(msj);

        mailSender.send(mensaje);
    }
    
    @Async
    public void registroModificacionUsuario(Usuario c, String msj,String asunto ) {
        SimpleMailMessage mensaje = new SimpleMailMessage();
        mensaje.setTo(c.getEmail());
        mensaje.setFrom("eggmza4000@gmail.com");
        mensaje.setSubject(asunto);
        mensaje.setText(msj);

        mailSender.send(mensaje);
    }
}
