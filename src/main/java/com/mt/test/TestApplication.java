package com.mt.test;

import com.mt.test.model.Name;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @GetMapping
    public String hello() {
        return "Czesc nieznajomy";
    }

    @GetMapping("/{name}")
    public String helloGet(@PathVariable String name) {
        return "Czesc " + name;
    }

    @PostMapping
    public String helloPost(@RequestBody Name name) {
        return "Czesc " + name.getName();
    }


}
