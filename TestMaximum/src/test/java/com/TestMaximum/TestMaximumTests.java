package com.TestMaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTests {
    @Test
    public void givenNumbers_whenMaximumAtPosition1_shouldReturnPosition1 () {
        TesMaximum tesMaximum = new TesMaximum(9, 4, 3);
        int maximum = tesMaximum.findMaximumNumber();
        Assert.assertEquals(9, maximum);
    }
    @Test
    public void givenNumbers_whenMaximumAtPosition2_shouldReturnPosition2 () {
        TesMaximum tesMaximum = new TesMaximum(5, 7, 2);
        int maximum = tesMaximum.findMaximumNumber();
        Assert.assertEquals(7, maximum);
    }

    @Test
    public void givenNumbers_whenMaximumAtPosition3_shouldReturnPosition3 () {
        TesMaximum tesMaximum = new TesMaximum(10, 5, 17);
        int maximum = tesMaximum.findMaximumNumber();
        Assert.assertEquals(17, maximum);
    }

}
