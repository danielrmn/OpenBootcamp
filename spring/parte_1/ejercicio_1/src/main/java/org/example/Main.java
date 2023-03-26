package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        holaMundo saludo = (holaMundo) context.getBean("holaMundo");

        String hello = saludo.imprimirSaludo();
        System.out.println(hello);
    }
}