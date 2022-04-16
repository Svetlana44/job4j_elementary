package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int tempMin;
        for (int i = 0; i < array.length - 1; i++) {
            tempMin = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (tempMin > array[j]) {
                    int t2 = tempMin;
                    tempMin = array[j];
                    array[j] = t2;
                }
            }
            array[i] = tempMin;
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
