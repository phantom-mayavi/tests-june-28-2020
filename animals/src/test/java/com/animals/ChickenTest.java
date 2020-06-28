package com.animals;

import com.animals.app.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.animals.constants.ApplicationConstants.CANT_FLY;
import static org.junit.Assert.*;

public class ChickenTest extends BaseTest {

    Chicken chicken = new Chicken();
    Chicken.Rooster rooster = new Chicken.Rooster();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sing() {
        chicken.sing();
        assertEquals(addNewLine("Cluck, cluck"), byteArrayOutputStream.toString());
    }

    @Test
    public void sing_rooster() {
        rooster.sing();
        assertEquals(addNewLine("Cock-a-doodle-doo"), byteArrayOutputStream.toString());
    }

    @Test
    public void fly() {
        chicken.fly();
        assertEquals(addNewLine(CANT_FLY), byteArrayOutputStream.toString());
    }
}