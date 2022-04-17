package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int[] arrayRow : array) {
            for (int i = 0; i < arrayRow.length; i++) {
                if (arrayRow[i] < 0) {
                    arrayRow[i] = 0;
                }
            }
        }
        return array;
    }
}
