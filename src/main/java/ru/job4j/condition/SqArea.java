package ru.job4j.condition;
public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result = SqArea.square(4, 1);
        System.out.println("p = 4, k = 1, s = 1, real = " + result);
        result = SqArea.square(8, 1);
        System.out.println("p = 8, k = 1, s = 4, real = " + result);
    }
}
