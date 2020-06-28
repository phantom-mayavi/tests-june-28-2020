package com.animals.helper;

import com.animals.constants.Sound;

public class SoundHelper {
    private Sound sound;

    public SoundHelper(Sound sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(sound.getSound());
    }
}
