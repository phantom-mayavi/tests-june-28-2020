package com.animals;

import static com.animals.constants.ApplicationConstants.SWIMMING;

public class Duck extends Bird {
    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }

    public void swim() {
        System.out.println(SWIMMING);
    }
}
