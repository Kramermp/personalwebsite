package com.web.personalwebsite.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@RequestMapping("")
public class ConfigController {
    private static Config config;

    @Autowired
    ConfigController(Config config) {
        this.config = config;
    }

    @GetMapping
    String helloWorld() {
        return "Hello for " + config.getFirstName();
    }
}
