package com.example.demo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.HelloService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HelloRestController {
    private final HelloService service;

    public HelloRestController(HelloService service) {
        this.service = service;
    }

    @GetMapping(path = "/hello", produces = "application/json")
    public String hello() {
        return service.hello();
    }
}
