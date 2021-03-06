package com.animals;

import com.animals.app.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.animals.constants.ApplicationConstants.FLYING;
import static org.junit.Assert.*;

public class BirdTest extends BaseTest {
    Bird bird = new Bird();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void fly() {
        bird.fly();
        assertEquals(addNewLine(FLYING), byteArrayOutputStream.toString());
    }

    @Test
    public void sing() {
        bird.sing();
        assertEquals(addNewLine("I am singing"), byteArrayOutputStream.toString());
    }
}