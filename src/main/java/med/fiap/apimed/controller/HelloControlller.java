package med.fiap.apimed.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloControlller {

    @GetMapping
    public String olaMundo() {
        return "Hello World!";
    }
}
