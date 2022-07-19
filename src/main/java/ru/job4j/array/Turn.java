package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = array[n - i - 1];
            array[n - i - 1] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
