package com.animals;

import com.animals.actions.Flyable;
import com.animals.constants.Sound;
import com.animals.helper.SoundHelper;

import static com.animals.constants.ApplicationConstants.FLYING;

public class Bird extends Animal implements Flyable {
    private SoundHelper soundHelper;

    public Bird() {
        this.soundHelper = new SoundHelper(Sound.DEFAULT);
    }

    public Bird(SoundHelper soundHelper) {
        this.soundHelper = soundHelper;
    }

    public void fly() {
        System.out.println(FLYING);
    }

    public void sing() {
        soundHelper.makeSound();
    }
}
