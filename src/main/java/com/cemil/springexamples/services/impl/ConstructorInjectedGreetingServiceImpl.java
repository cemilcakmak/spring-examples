package com.cemil.springexamples.services.impl;

import com.cemil.springexamples.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World! - Constructor";
    }
}
