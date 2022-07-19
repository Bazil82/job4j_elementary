package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean temp = data[0];
        boolean result = true;
        for (int i = 1; i < data.length - 1; i++) {
           if (data[i] != temp) {
               result = false;
               break;
           }
        }
        return result;
    }
}
