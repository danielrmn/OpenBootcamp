package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        NotificationService prueba =  context.getBean(NotificationService.class);
        UserService prueba2 = context.getBean(UserService.class);

        System.out.println(prueba.imprimirSaludo());
        System.out.println(prueba2.imprimir.imprimirSaludo());
    }
}