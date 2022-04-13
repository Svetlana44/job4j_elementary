package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromMinus2To4Then4() {
        int start = -2;
        int finish = 4;
        int result = Counter.sumByEven(start, finish);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}