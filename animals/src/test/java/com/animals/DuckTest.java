package com.animals;

import com.animals.app.BaseTest;
import com.animals.constants.Sound;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.animals.constants.ApplicationConstants.SWIMMING;
import static org.junit.Assert.*;

public class DuckTest extends BaseTest {

    Duck duck = new Duck();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sing() {
        duck.sing();
        assertEquals(addNewLine(Sound.DUCK.getSound()), byteArrayOutputStream.toString());
    }

    @Test
    public void swim() {
        duck.swim();
        assertEquals(addNewLine(SWIMMING), byteArrayOutputStream.toString());
    }
}