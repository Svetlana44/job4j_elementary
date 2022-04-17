package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void calculateWhenBound3Then014() {
        int[] expected = new int[]{0, 1, 4};
        int[] actual = Square.calculate(3);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateWhenBound5Then014916() {
        int[] expected = new int[]{0, 1, 4, 9, 16};
        int[] actual = Square.calculate(5);
        Assert.assertArrayEquals(expected, actual);
    }
}