package com.animals;

import com.animals.app.BaseTest;
import com.animals.constants.Sound;
import com.animals.helper.SoundHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParrotTest extends BaseTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test_dog_sound() {
        Parrot parrot = new Parrot(new SoundHelper(Sound.DOG));
        parrot.sing();
        assertEquals(addNewLine(Sound.DOG.getSound()), byteArrayOutputStream.toString());
    }

    @Test
    public void test_cat_sound() {
        Parrot parrot = new Parrot(new SoundHelper(Sound.CAT));
        parrot.sing();
        assertEquals(addNewLine(Sound.CAT.getSound()), byteArrayOutputStream.toString());
    }

    @Test
    public void test_rooster_sound() {
        Parrot parrot = new Parrot(new SoundHelper(Sound.ROOSTER));
        parrot.sing();
        assertEquals(addNewLine(Sound.ROOSTER.getSound()), byteArrayOutputStream.toString());
    }
}