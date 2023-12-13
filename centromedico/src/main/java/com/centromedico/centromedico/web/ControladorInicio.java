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


    @GetMapping("/")
    public String inicio(Usuario usuario, Model model) {
        
        log.info("Ejecutando controlador inicio");
        
        return "index";
    }

    @GetMapping("/iniciarSesion/{usuario}")
    public String iniciarSesion(@ModelAttribute Usuario usuario){
        
        UsuarioServiceImp uImp = new UsuarioServiceImp();
        int existeUsuario = uImp.encontrarUsuario(usuario);
       
        switch (existeUsuario) {
            case 1:
                return "administrador";
                
            case 2:
                return "paciente";
            case 3:
                return "medico";
            default:
                return "userNotFound";
                
        }
        
        
    }

    @GetMapping("/crearUsuario")
    public String crearUsuario(){


        return "crearUsuario";
    }
}
