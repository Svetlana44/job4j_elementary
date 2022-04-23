package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceWhenX10Y10X20Y20Then1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 1);
        double actual = a.distance(b);
        double expected = 1;
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void distanceWhenX1minus1Y1minus3X20Y20Then4Dot12() {
        Point a = new Point(-1, -3);
        Point b = new Point(0, 1);
        double actual = a.distance(b);
        double expected = 4.12;
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void distanceWhenX1minus2Y1minus3X2minus4Y2minus5Then2Dot82() {
        Point a = new Point(-2, -3);
        Point b = new Point(-4, -5);
        double actual = a.distance(b);
        double expected = 2.82;
        assertEquals(expected, actual, 0.01);
    }
}