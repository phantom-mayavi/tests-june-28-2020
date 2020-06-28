package com.animals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BirdTest {
    Bird bird = new Bird();

    private PrintStream printStream; // TODO : Move to base test or suite
    private ByteArrayOutputStream byteArrayOutputStream;

    @Before
    public void setUp() throws Exception {
        printStream = System.out;
        byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fly() {
        bird.fly();
        assertEquals("I am flying\r\n", byteArrayOutputStream.toString());
    }

    @Test
    public void sing() {
        bird.sing();
        assertEquals("I am singing\r\n", byteArrayOutputStream.toString());
    }
}