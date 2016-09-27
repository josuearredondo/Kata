package com.hbdriod.kata;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void souldReturnZeroIfChampIsEmpty() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(0,calculator.Add(""));
    }
    @Test
    public void souldReturnNumberIfRecoveryOneDigit() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(1,calculator.Add("1"));
    }
    @Test
    public void souldReturnNumbersSumIfRecoveryTwoNumbers() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(3,calculator.Add("1,2"));
    }
}