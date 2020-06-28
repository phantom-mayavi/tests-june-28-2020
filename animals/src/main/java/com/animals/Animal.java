package com.animals;

import com.animals.actions.Walkable;

import static com.animals.constants.ApplicationConstants.WALKING;

public class Animal implements Walkable {
    public void walk() {
        System.out.println(WALKING);
    }
}
