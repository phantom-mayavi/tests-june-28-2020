package com.animals;

import com.animals.app.BaseTest;
import com.animals.constants.ApplicationConstants;
import org.junit.Test;

import static org.junit.Assert.*;

public class FishTest extends BaseTest {
    Fish fish = new Fish();

    @Test
    public void swim() {
        fish.swim();
        assertEquals(addNewLine(ApplicationConstants.SWIMMING), byteArrayOutputStream.toString());
    }

}