package com.cemil.springexamples;

import com.cemil.springexamples.controllers.ConstructorInjectedController;
import com.cemil.springexamples.controllers.PropertyInjectedController;
import com.cemil.springexamples.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringExamplesApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringExamplesApplication.class, args);

        System.out.println("=== Property Injected Controller, Spring Framework DI ===");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("=== Setter Injected Controller, Spring Framework DI ===");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("=== Constructor Injected Controller, Spring Framework DI ===");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

    }
}
