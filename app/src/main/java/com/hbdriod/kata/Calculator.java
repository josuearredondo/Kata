package com.hbdriod.kata;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Human Booster on 27/09/2016.
 */

public class Calculator {
    public int Add(String numbers) {
        int sum = 0;
        if (numbers.isEmpty()) {
            sum = 0;
        } else {
            StringTokenizer tokens = new StringTokenizer(numbers, ",");
            String number1 = tokens.nextToken();
            String number2 = tokens.nextToken();
            sum = Integer.parseInt(number1.toString()) + Integer.parseInt(number2.toString());
        }
        return sum;
    }
}
