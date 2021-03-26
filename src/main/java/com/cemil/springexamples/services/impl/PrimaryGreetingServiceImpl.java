package com.cemil.springexamples.services.impl;

import com.cemil.springexamples.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World! - Primary Bean";
    }
}
