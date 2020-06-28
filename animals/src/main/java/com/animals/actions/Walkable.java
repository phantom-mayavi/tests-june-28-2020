package com.animals.actions;

import static com.animals.constants.ApplicationConstants.WALKING;

public interface Walkable {
    default void walk() {
        System.out.println(WALKING);
    }
}
