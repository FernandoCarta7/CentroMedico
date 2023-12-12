package centromedico.com.web;

import org.springframework.web.bind.annotation.*;

public class ControladorInicio {
    @GetMapping("/")
    public String inicio(){

        return "index";
    }
}
