package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private int num1 = 3;

    public void start(int count) {

    }

    public List<String> getResults() {
        return results;
    }

    public String getFizzIfContainNumber1(int num) {
        return isContainNumber1(num) ? "Fizz" : "";
    }

    private boolean isContainNumber1(int num) {
        if (num / 10 == 0)
            return num == num1;
        return isContainNumber1(num % 10) || isContainNumber1(num / 10);
    }


}


