package org.example;

import org.springframework.stereotype.Component;

@Component

public class NotificationService {

    public String imprimirSaludo(){
        System.out.println("Ejecutando constructor NotificationService");
        return "HolaMundo";
    }
}
