package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void squareWhenP1K2Then0Dot05() {
        double expected = 0.05;
        double actual = SqArea.square(1, 2);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void squareWhenP20K2Then22Dot22() {
        double expected = 22.22;
        double actual = SqArea.square(20, 2);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void squareWhenP1K0Dot2Then0Dot03() {
        double expected = 0.03;
        double actual = SqArea.square(1, 0.2);
        assertEquals(expected, actual, 0.01);
    }
}