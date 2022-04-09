package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void calcWhenA1B1C1X1Then3() {
        long expected = 3;
        long actual = X2.calc(1, 1, 1, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void calcWhenA0B1C1X1Then2() {
        long expected = 2;
        long actual = X2.calc(0, 1, 1, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void calcWhenA1B1C0X1Then2() {
        long expected = 2;
        long actual = X2.calc(1, 1, 0, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void calcWhenA1B1C1X0Then1() {
        long expected = 1;
        long actual = X2.calc(1, 1, 1, 0);
        assertEquals(expected, actual);
    }
}