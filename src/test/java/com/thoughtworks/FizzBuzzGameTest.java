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

    @Test
    public void should_return_Fizz_when_multiple_of_3() {
        assertEquals(fizzBuzzGame.getFizzIfMultipleOfNumber1(6),"Fizz");
    }

    @Test
    public void should_return_empty_when_not_multiple_of_3() {
        assertEquals(fizzBuzzGame.getFizzIfMultipleOfNumber1(7),"");
    }

    @Test
    public void should_return_Buzz_when_multiple_of_5() {
        assertEquals(fizzBuzzGame.getBuzzIfMultipleOfNumber2(10),"Buzz");
    }

    @Test
    public void should_return_empty_when_not_multiple_of_5() {
        assertEquals(fizzBuzzGame.getBuzzIfMultipleOfNumber2(7),"");
    }

    @Test
    public void should_return_Whizz_when_multiple_of_7() {
        assertEquals(fizzBuzzGame.getWhizzIfMultipleOfNumber2(14),"Whizz");
    }

    @Test
    public void should_return_empty_when_not_multiple_of_7() {
        assertEquals(fizzBuzzGame.getWhizzIfMultipleOfNumber2(20),"");
    }

}
