package com.br.eduardomatsuda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.br.eduardomatsuda.repository",
                               "com.br.eduardomatsuda.service",})
@RestController
public class VendasApplication {

    @Value("${application.name}")
    private String applicationName;

    @GetMapping ("/hello")
    public String helloWorld(){
        return "Sistema de Vendas";
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
