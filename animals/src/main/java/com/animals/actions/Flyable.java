package com.animals.actions;

import static com.animals.constants.ApplicationConstants.FLYING;

public interface Flyable {
    default void fly() {
        System.out.println(FLYING);
    }
}
