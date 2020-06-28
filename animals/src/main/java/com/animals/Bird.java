package com.animals;

import static com.animals.constants.ApplicationConstants.FLYING;

public class Bird extends Animal {
    public void fly() {
        System.out.println(FLYING);
    }

    public void sing() {
        System.out.println("I am singing");
    }
}
