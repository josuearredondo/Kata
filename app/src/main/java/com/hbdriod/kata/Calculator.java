package com.hbdriod.kata;

/**
 * Created by Human Booster on 27/09/2016.
 */

public class Calculator {
    public int Add(String numbers) {
        int sum = 0;
        if (numbers.isEmpty() || numbers.equals(" ")) {
            sum = 0;
        }
        if (!numbers.isEmpty() && numbers.length() == 1) {
            sum = Character.getNumericValue(numbers.charAt(0));
        }
        if (!numbers.isEmpty() && numbers.length() == 3) {
            sum = Character.getNumericValue(numbers.charAt(0))+Character.getNumericValue(numbers.charAt(2));
        }
        return sum;
    }
}
