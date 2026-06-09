package com.example.projekt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        Map<String, String> response = new LinkedHashMap<>();

    response.put("message", "Hello from Spring Boot!");
    response.put("autorzy", "Bartosz Kokoszko, Nikita Bielan");
    response.put("indeksy", "77050, 77336");

    return response;
    }
}