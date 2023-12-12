package com.centromedico.centromedico.web;

import com.centromedico.centromedico.servicio.PacienteServiceImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    private PacienteServiceImp pacienteServiceImp;

    @GetMapping("/")
    public String inicio(Model model) {
        pacienteServiceImp = new PacienteServiceImp();
        var pacientes = pacienteServiceImp.listar();
        log.info("Ejecutando controlador inicio");
        model.addAttribute("pacientes", pacientes);
        return "index";
    }
}
