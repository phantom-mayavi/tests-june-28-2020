package com.animals;

import com.animals.actions.NonFlyable;
import com.animals.constants.Sound;
import com.animals.helper.SoundHelper;

import static com.animals.constants.ApplicationConstants.CANT_FLY;

public class Chicken extends Bird implements NonFlyable {
    public Chicken() {
        super(new SoundHelper(Sound.CHICKEN));
    }

    public Chicken(SoundHelper soundHelper) {
        super(soundHelper);
    }

    @Override
    public void fly() {
        System.out.println(CANT_FLY);
    }

    public static class Rooster extends Chicken {
        public Rooster() {
            super(new SoundHelper(Sound.ROOSTER));
        }
    }
}
