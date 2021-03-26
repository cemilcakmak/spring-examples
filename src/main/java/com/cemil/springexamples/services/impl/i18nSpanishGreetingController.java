package com.cemil.springexamples.services.impl;

import com.cemil.springexamples.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service
public class i18nSpanishGreetingController implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo!";
    }

}
