package com.animals.constants;

public enum Sound {
    DEFAULT("I am singing"),
    CHICKEN("Cluck, cluck"),
    DUCK("Quack, quack"),
    ROOSTER("Cock-a-doodle-doo"),
    DOG("Woof, woof"),
    CAT("Meow");


    private String s;

    Sound(String s) {
        this.s = s;
    }

    public String getSound() {
        return this.s;
    }
}
