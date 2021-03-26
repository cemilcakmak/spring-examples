package com.cemil.springexamples.controllers;

import com.cemil.springexamples.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
