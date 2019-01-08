package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemovevowelsCheck {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    Removevowels removevowels;

    @Test
    public void vowelSuccess(){
        String expectedValue = removevowels.isvowel("Place Name without Vowels:0 Ind " +
                "Place Name without Vowels:1 Untd Stts " +
                "Place Name without Vowels:2 Grmny " +
                "Place Name without Vowels:3 Egypt " +
                "Place Name without Vowels:4 czchslvk");
        String actualValue = removevowels.isvowel("India,United States,Germany,Egypt,czechoslovakia");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void vowelfailure(){
        String expectedValue = null;
        String actualValue = removevowels.isvowel(null);
        assertNotEquals(expectedValue,actualValue);

    }
}