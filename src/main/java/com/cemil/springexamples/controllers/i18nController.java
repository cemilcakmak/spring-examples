package com.cemil.springexamples.controllers;

import com.cemil.springexamples.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class i18nController {

    private final GreetingService greetingService;

    public i18nController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
