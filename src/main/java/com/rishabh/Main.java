package com.rishabh;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // First parameter is the Name of the instance to which we refer
        Parrot p = context.getBean("p2", Parrot.class);
        System.out.println(p.getName());
        Parrot p2 = context.getBean("Koko", Parrot.class);
        System.out.println(p2.getName());
    }
}