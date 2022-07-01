package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        if (n <= 1) {
            return 1;
        }
        int result = 1;
        for (int count = 1; count <= n; count++) {
            result *= count;
        }
        return result;
    }
}
