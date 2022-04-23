package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void maxWhen1And2Then2() {
        int expected = Max.max(1, 2);
        int actual = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void maxWhen1And1Then1() {
        int expected = Max.max(1, 1);
        int actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void maxWhen3And2Then3() {
        int expected = Max.max(3, 2);
        int actual = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void maxWhen3And2And1Then3() {
        int expected = Max.max(3, 2, 1);
        int actual = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void maxWhen3And3And3Then3() {
        int expected = Max.max(3, 3, 3);
        int actual = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void maxWhenMinus3And3And3And3Then3() {
        int expected = Max.max(-3, 3, 3, 3);
        int actual = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void maxWhenMinus3AndMinus2And3And3Then3() {
        int expected = Max.max(-3, -2, 3, 3);
        int actual = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void maxWhenMinus3AndMinus2AndMinus1And0Then0() {
        int expected = Max.max(-3, -2, -1, 0);
        int actual = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void maxWhenMinus4AndMinus3AndMinus2AndMinus1ThenMinus1() {
        int expected = Max.max(-4, -3, -2, -1);
        int actual = -1;
        assertEquals(expected, actual);
    }
}