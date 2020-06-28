package com.animals.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.animals.constants.ApplicationConstants.FLYING;
import static com.animals.constants.ApplicationConstants.WALKING;
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
        assertEquals(addNewLine(WALKING) +
                addNewLine(FLYING) +
                addNewLine("I am singing") +
                addNewLine("Cock-a-doodle-doo"), byteArrayOutputStream.toString());
    }
}