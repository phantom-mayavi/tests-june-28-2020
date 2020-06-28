package com.animals;

public class Chicken extends Bird {
    public void sing() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}