package com.cemil.springexamples.controllers;

import com.cemil.springexamples.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
       return greetingService.sayGreeting();
    }
}
