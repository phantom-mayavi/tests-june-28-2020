package com.animals;

import com.animals.constants.Sound;
import com.animals.helper.SoundHelper;

import static com.animals.constants.ApplicationConstants.SWIMMING;

public class Duck extends Bird {
    public Duck() {
        super(new SoundHelper(Sound.DUCK));
    }

    public void swim() {
        System.out.println(SWIMMING);
    }
}
