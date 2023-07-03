package com.example.evc02;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/")
public class Controller{

    @GetMapping(path="/")
    public String home(){
        return "AT71894234 - Nayara Lavado";
    }

    @GetMapping(path="/idat/codigo")
    public String cod(){
        return "AT71894234";
    }

    @GetMapping(path="/idat/nombre-completo")
    public String nombrecompleto(){
        return "Ashly Nayara Lavado Galarza";
    }

}   