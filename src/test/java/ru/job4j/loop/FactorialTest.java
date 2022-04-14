package ru.job4j.loop;

import org.junit.Test;

import  org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int actual = Factorial.calc(5);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
       int expected = 1;
       int actual = Factorial.calc(0);
       Assert.assertEquals(expected,actual);
    }
}