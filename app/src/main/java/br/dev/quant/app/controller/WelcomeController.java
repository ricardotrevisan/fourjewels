package br.dev.quant.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private static final String HELLO = "/hello";

    @GetMapping(value=HELLO)
    public String getMessage(){
        return "retorno da chamada...";
    }
}
