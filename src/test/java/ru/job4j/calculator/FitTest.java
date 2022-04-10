package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 173;
        double actual = Fit.manWeight(in);
        double expected = 83.9499;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void womanWeight() {
        short in = 173;
        double actual = Fit.womanWeight(in);
        double expected = 72.4499;
        assertEquals(expected, actual, 0.0001);
    }
}