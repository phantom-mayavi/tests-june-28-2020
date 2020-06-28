package com.animals;

import com.animals.app.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest extends BaseTest {

    Chicken chicken = new Chicken();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sing() {
        chicken.sing();
        assertEquals("Cluck, cluck\r\n", byteArrayOutputStream.toString());
    }

    @Test
    public void fly() {
        chicken.fly();
        assertEquals("I cannot fly\r\n", byteArrayOutputStream.toString());
    }
}