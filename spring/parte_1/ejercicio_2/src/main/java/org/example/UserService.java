package org.example;

import org.springframework.stereotype.Component;
@Component

public class UserService {
    NotificationService imprimir;

    public UserService(NotificationService imprimir){
        System.out.println("Ejecutando constructor UserService");
        this.imprimir = imprimir;
    }
}
