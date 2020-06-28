package com.animals.actions;

import com.animals.constants.ApplicationConstants;

public interface Swimmable {
    default void swim() {
        System.out.println(ApplicationConstants.SWIMMING);
    }
}
