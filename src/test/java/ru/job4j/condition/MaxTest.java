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
}