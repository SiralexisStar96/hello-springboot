package com.example.hellospringboot1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HelloSpringboot1Application {

    //Creamos los logs
    private static final Logger log = LoggerFactory.getLogger(HelloSpringboot1Application.class);

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringboot1Application.class, args);
    }

    @RequestMapping("/hello")
    String hello() {
        //Ponemos un chivato
        log.info("Invocando el método hello()");

        return "Hola k ase";
    }

    @RequestMapping("/goodby")
    String goodbye() {
        //Ponemos un chivato
        log.info("Invocando método goodby()");

        return "Hasta luego Lucas";
    }



}
