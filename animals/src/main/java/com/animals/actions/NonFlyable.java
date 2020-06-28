package com.animals.actions;

import static com.animals.constants.ApplicationConstants.CANT_FLY;

public interface NonFlyable {
    default void fly() {
        System.out.println(CANT_FLY);
    }
}
