package com.centromedico.web;

import com.centromedico.domain.Usuario;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio(Usuario usuario, Model model) {

        log.info("Ejecutando controlador inicio");

        return "index";
    }

}
