package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int lastIndex = array.length - i - 1;
            int currentIndex = i;
            result[currentIndex] = array[lastIndex];
        }
        return result;
    }
}
