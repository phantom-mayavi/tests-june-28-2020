package com.animals.app;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BaseTest {
    public PrintStream printStream;
    public ByteArrayOutputStream byteArrayOutputStream;

    @Before
    public void setup() throws Exception {
        printStream = System.out;
        byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @After
    public void tearDown() throws Exception {
        byteArrayOutputStream.reset();
    }

    public static String addNewLine(String str) {
        return str + "\r\n";
    }
}
