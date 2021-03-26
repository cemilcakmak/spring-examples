package com.cemil.springexamples.services.impl;

import com.cemil.springexamples.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service
public class i18nEnglishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
