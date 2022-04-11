package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceWhenX10Y10X20Y20Then1() {
        double actual = Point.distance(0, 0, 0, 1);
        double expected = 1;
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void distanceWhenX1minus1Y1minus3X20Y20Then4Dot12() {
        double actual = Point.distance(-1, -3, 0, 1);
        double expected = 4.12;
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void distanceWhenX1minus2Y1minus3X2minus4Y2minus5Then2Dot82() {
        double actual = Point.distance(-2, -3, -4, -5);
        double expected = 2.82;
        assertEquals(expected, actual, 0.01);
    }
}