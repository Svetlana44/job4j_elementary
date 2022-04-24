package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceWhenX10Y10X20Y20Then1() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 1, 0);
        double actual = a.distance3D(b);
        double expected = 1;
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void distanceWhenX1minus1Y1minus3X20Y20Then4Dot12() {
        Point a = new Point(-1, -3, -2);
        Point b = new Point(0, 1, 2);
        double actual = a.distance3D(b);
        double expected = 5.74;
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void distanceWhenX1minus2Y1minus3X2minus4Y2minus5Then2Dot82() {
        Point a = new Point(-2, -3, -1);
        Point b = new Point(-4, -5, 7);
        double actual = a.distance3D(b);
        double expected = 8.48;
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void distanceWhenX1minus2Y1minus3Z10X2minus4Y2minus5Z20Then2Dot82() {
        Point a = new Point(-2, -3, 0);
        Point b = new Point(-4, -5, 0);
        double actual = a.distance3D(b);
        double expected = 2.82;
        assertEquals(expected, actual, 0.01);
    }
}