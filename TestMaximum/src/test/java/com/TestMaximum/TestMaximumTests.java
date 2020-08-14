package com.TestMaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTests {
    @Test
    public void givenIntegers_whenMaximumAtPosition1_shouldReturnPosition1 () {
        TestMaximum tesMaximum = new TestMaximum();
        int maximum = tesMaximum.findMaximumValue(9, 4, 3);
        Assert.assertEquals(9, maximum);
    }
    @Test
    public void givenIntegers_whenMaximumAtPosition2_shouldReturnPosition2 () {
        TestMaximum tesMaximum = new TestMaximum();
        int maximum = tesMaximum.findMaximumValue(5, 7, 2);
        Assert.assertEquals(7, maximum);
    }

    @Test
    public void givenIntegers_whenMaximumAtPosition3_shouldReturnPosition3 () {
        TestMaximum tesMaximum = new TestMaximum();
        int maximum = tesMaximum.findMaximumValue(10, 15, 17);
        Assert.assertEquals(17, maximum);
    }

    @Test
    public void givenFloats_whenMaximumAtPosition1_shouldReturnPosition1() {
        TestMaximum testMaximum = new TestMaximum();
        float maximum = testMaximum.findMaximumValue((float)3.5, (float)2.4, (float)0.6);
        Assert.assertEquals(3.5, maximum , 1);
    }

    @Test
    public void givenFloats_whenMaximumAtPosition2_shouldReturnPosition2() {
        TestMaximum testMaximum = new TestMaximum();
        float maximum = testMaximum.findMaximumValue((float)3.5, (float)8.4, (float)0.6);
        Assert.assertEquals(8.4, maximum , 1);
    }
    @Test
    public void givenFloats_whenMaximumAtPosition3_shouldReturnPosition3() {
        TestMaximum testMaximum = new TestMaximum();
        float maximum = testMaximum.findMaximumValue((float)1.5, (float)2.4, (float)10.6);
        Assert.assertEquals(10.6, maximum , 1);
    }

    @Test
    public void givenStrings_whenMaximumAtPosition1_shouldReturnPosition1() {
        TestMaximum testMaximum = new TestMaximum();
        String maximum = testMaximum.findMaximumValue("Tom","Jerry","Dexter");
        Assert.assertEquals("Tom",maximum);
    }

    @Test
    public void givenStrings_whenMaximumAtPosition2_shouldReturnPosition2() {
        TestMaximum testMaximum = new TestMaximum();
        String maximum = testMaximum.findMaximumValue("Jerry","Noddy","Dexter");
        Assert.assertEquals("Noddy",maximum);
    }

    @Test
    public void givenStrings_whenMaximumAtPosition3_shouldReturnPosition3() {
        TestMaximum testMaximum = new TestMaximum();
        String maximum = testMaximum.findMaximumValue("Jerry","Dexter","Oswald");
        Assert.assertEquals("Oswald",maximum);
    }
}
