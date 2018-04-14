package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private int num1 = 3;
    private int num2 = 5;
    private int num3 = 7;

    public void start(int count) {
        String result;
        for (int i = 1; i <= count; i++) {
            result = "";
            if (isContainNumber1(i)) {
                result = getFizzIfContainNumber1(i);
            } else {
                result += getFizzIfMultipleOfNumber1(i);
                result += getBuzzIfMultipleOfNumber2(i);
                result += getWhizzIfMultipleOfNumber2(i);
            }
            if (result.length() == 0)
                result = String.valueOf(i);
            results.add(result);
        }
    }

    public List<String> getResults() {
        return results;
    }

    public String getFizzIfContainNumber1(int num) {
        return isContainNumber1(num) ? "Fizz" : "";
    }

    public String getFizzIfMultipleOfNumber1(int num) {
        return isMultipleOfNumber1(num) ? "Fizz" : "";
    }

    public String getBuzzIfMultipleOfNumber2(int num) {
        return isMultipleOfNumber2(num) ? "Buzz" : "";
    }

    public String getWhizzIfMultipleOfNumber2(int num) {
        return isMultipleOfNumber3(num) ? "Whizz" : "";
    }

    private boolean isMultipleOfNumber3(int num) {
        return num % num3 == 0;
    }

    private boolean isMultipleOfNumber2(int num) {
        return num % num2 == 0;
    }

    private boolean isMultipleOfNumber1(int num) {
        return num % num1 == 0;
    }

    private boolean isContainNumber1(int num) {
        if (num / 10 == 0)
            return num == num1;
        return isContainNumber1(num % 10) || isContainNumber1(num / 10);
    }
}


