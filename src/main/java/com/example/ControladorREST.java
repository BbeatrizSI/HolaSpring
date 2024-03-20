package com.example;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorREST {
    @GetMapping("/")
    public String start(Logger log) {
        log.info("Estoy ejecutando el controlador REST");
        return "Mi primer Hola Mundo";
    }
}
