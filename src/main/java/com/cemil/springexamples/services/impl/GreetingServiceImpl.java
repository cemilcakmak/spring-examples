package com.cemil.springexamples.services.impl;

import com.cemil.springexamples.services.GreetingService;

public class GreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
