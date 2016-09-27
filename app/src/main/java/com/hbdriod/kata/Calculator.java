package com.hbdriod.kata;

/**
 * Created by Human Booster on 27/09/2016.
 */

public class Calculator {
    public int Add(String numbers) {
        int sum = 0;
        if (numbers.isEmpty()) {
            sum = 0;
        } else {
            sum = ((!numbers.isEmpty()) && (!numbers.isEmpty() && numbers.length() == 3)) ? Character.getNumericValue(numbers.charAt(0))+Character.getNumericValue(numbers.charAt(2)): Character.getNumericValue(numbers.charAt(0));
        }
        return sum;
    }
}
