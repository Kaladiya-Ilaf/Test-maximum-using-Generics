package com.TestMaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTests {
    @Test
    public void givenIntegers_whenMaximumAtPosition1_shouldReturnPosition1 () {
        TestMaximum tesMaximum = new TestMaximum(9, 4, 3);
        int maximum = (int) tesMaximum.findMaximum();
        Assert.assertEquals(9, maximum);
    }
    @Test
    public void givenIntegers_whenMaximumAtPosition2_shouldReturnPosition2 () {
        TestMaximum tesMaximum = new TestMaximum(5, 7, 2);
        int maximum = (int) tesMaximum.findMaximum();
        Assert.assertEquals(7, maximum);
    }

    @Test
    public void givenIntegers_whenMaximumAtPosition3_shouldReturnPosition3 () {
        TestMaximum tesMaximum = new TestMaximum(10, 15, 17);
        int maximum = (int) tesMaximum.findMaximum();
        Assert.assertEquals(17, maximum);
    }

    @Test
    public void givenFloats_whenMaximumAtPosition1_shouldReturnPosition1() {
        TestMaximum testMaximum = new TestMaximum((float)3.5, (float)2.4, (float)0.6);
        float maximum = (float) testMaximum.findMaximum();
        Assert.assertEquals(3.5, maximum , 1);
    }

    @Test
    public void givenFloats_whenMaximumAtPosition2_shouldReturnPosition2() {
        TestMaximum testMaximum = new TestMaximum((float)3.5, (float)8.4, (float)0.6);
        float maximum = (float) testMaximum.findMaximum();
        Assert.assertEquals(8.4, maximum , 1);
    }
    @Test
    public void givenFloats_whenMaximumAtPosition3_shouldReturnPosition3() {
        TestMaximum testMaximum = new TestMaximum((float)1.5, (float)2.4, (float)10.6);
        float maximum = (float) testMaximum.findMaximum();
        Assert.assertEquals(10.6, maximum , 1);
    }

    @Test
    public void givenStrings_whenMaximumAtPosition1_shouldReturnPosition1() {
        TestMaximum testMaximum = new TestMaximum("Tom","Jerry","Dexter");
        String maximum = (String) testMaximum.findMaximum();
        Assert.assertEquals("Tom",maximum);
    }

    @Test
    public void givenStrings_whenMaximumAtPosition2_shouldReturnPosition2() {
        TestMaximum testMaximum = new TestMaximum("Jerry","Noddy","Dexter");
        String maximum = (String) testMaximum.findMaximum();
        Assert.assertEquals("Noddy",maximum);
    }

    @Test
    public void givenStrings_whenMaximumAtPosition3_shouldReturnPosition3() {
        TestMaximum testMaximum = new TestMaximum("Jerry","Dexter","Oswald");
        String maximum = (String) testMaximum.findMaximum();
        Assert.assertEquals("Oswald",maximum);
    }
}
