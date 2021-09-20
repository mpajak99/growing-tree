package com.company.service;

public interface Dieable {

    default void die(String name, int age) {
        System.out.println("The tree lived for " + age + " years");
        System.out.println("All trees do eventually die... or they are beheaded. " +
                "Who knows what really happened to " + name + "?");
    }
}
