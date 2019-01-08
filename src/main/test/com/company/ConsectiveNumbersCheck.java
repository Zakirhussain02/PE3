package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsectiveNumbersCheck {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    ConsectiveNumbers consectiveNumbers;
    @Test
    public void ConsectiveNumbersSuccess(){
        String expectedValue = "21,22,23,24,25,26,27 are consecutive numbers";
        String actualValue = consectiveNumbers.isConsecutive("21,22,23,24,25,26,27");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void ConsectiveNumbersFailure(){
        String expectedValue = "21,22,23,24,25,26,27 are consecutive numbers";
        String actualValue = consectiveNumbers.isConsecutive("21,22,23,24,25,26,28");
        assertNotEquals(expectedValue,actualValue);
    }

    @Test
    public void ConsectiveNumbersFailureTwo(){
        String expectedValue = "Number expected";
        String actualValue = consectiveNumbers.isConsecutive("*,i,8,9,10");
        Assert.assertEquals(expectedValue,actualValue);
    }

}