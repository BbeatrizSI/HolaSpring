package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorREST {

    @GetMapping("")
    public String start() {
        log.info("Estoy ejecutando MVN");
        return "indice.html";
    }
}
