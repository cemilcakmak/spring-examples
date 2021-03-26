package com.cemil.springexamples.services.impl;

import com.cemil.springexamples.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World! - Property";
    }
}
