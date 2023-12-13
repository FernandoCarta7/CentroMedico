package com.centromedico.centromedico.web;

import com.centromedico.centromedico.domain.Usuario;
import com.centromedico.centromedico.servicio.PacienteServiceImp;
import com.centromedico.centromedico.servicio.UsuarioServiceImp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
@Slf4j
public class ControladorInicio {

    private PacienteServiceImp pacienteServiceImp;

    @GetMapping("/")
    public String inicio(Usuario usuario, Model model) {
        
        log.info("Ejecutando controlador inicio");
        model.addAttribute("usuario", usuario);
        return "index";
    }

    @GetMapping("/iniciarSesion/{usuario}")
    public String iniciarSesion(@ModelAttribute Usuario usuario){
        
        UsuarioServiceImp uImp = new UsuarioServiceImp();
        boolean existeUsuario = uImp.encontrarUsuario(usuario);
        if (!existeUsuario) {
            return "index";    
        } else {}
        return "medico";
        
    }
}
