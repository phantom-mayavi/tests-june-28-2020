package com.animals;

import static com.animals.constants.ApplicationConstants.CANT_FLY;

public class Chicken extends Bird {
    public void sing() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public void fly() {
        System.out.println(CANT_FLY);
    }

    public static class Rooster {
        public void sing() {
            System.out.println("Cock-a-doodle-doo");
        }
    }
}
