package com.animals;

import com.animals.app.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AnimalTest extends BaseTest {

    Animal animal = new Animal();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void walk() {
        animal.walk();
        assertEquals("I am walking\r\n", byteArrayOutputStream.toString());
    }
}