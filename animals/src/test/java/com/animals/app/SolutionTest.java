package com.animals.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest extends BaseTest {
    Solution solution = new Solution();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMain() {
        solution.main(null);
        assertEquals("I am walking\r\n" +
                "I am flying\r\n" +
                "I am singing\r\n", byteArrayOutputStream.toString());
    }
}