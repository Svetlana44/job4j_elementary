package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class Calculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double extructAndDivision(double first, double second) {
        return extruct(first, second)
                + devision(first, second);
    }

    public static double sumMultiplyExtructAndDivision(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + extruct(first, second)
                + devision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + extructAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumMultiplyExtructAndDivision(10, 20));
    }
}