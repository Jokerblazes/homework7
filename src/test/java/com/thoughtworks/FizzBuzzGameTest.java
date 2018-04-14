package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {
    private FizzBuzzGame fizzBuzzGame;

    @Before
    public void setUp() {
        fizzBuzzGame = new FizzBuzzGame();
    }

    @Test
    public void should_return_Fizz_when_have_3() {
        assertEquals(fizzBuzzGame.getFizzIfContainNumber1(13), "Fizz");
    }

    @Test
    public void should_return_empty_when_not_hava_3() {
        assertEquals(fizzBuzzGame.getFizzIfContainNumber1(4),"");
    }
}
