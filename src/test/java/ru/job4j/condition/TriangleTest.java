package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void existWhen2Dot2And3And0Dot5ThenFalse() {
        boolean expected = Triangle.exist(2.2, 3, 0.5);
        assertFalse(expected);
    }

    @Test
    public void existWhen10Dot2And3And20Dot5ThenFalse() {
        boolean expected = Triangle.exist(10.2, 3, 20.5);
        assertFalse(expected);
    }

    @Test
    public void existWhen5And5And15ThenFalse() {
        boolean expected = Triangle.exist(5, 5, 15);
        assertFalse(expected);
    }

    @Test
    public void existWhen0And0And0ThenFalse() {
        boolean expected = Triangle.exist(0, 0, 0);
        assertFalse(expected);
    }

    @Test
    public void existWhen4ot9And5Dot2And5ThenTrue() {
        boolean expected = Triangle.exist(4.9, 5.2, 5);
        assertTrue(expected);
    }
}