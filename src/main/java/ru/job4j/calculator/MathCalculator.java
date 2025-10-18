package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double fourActs(double first, double second) {
        return sumAndMultiply(first, second) + differenceAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("The calculation result is: " + sumAndMultiply(10, 20));
        System.out.println("The calculation result is: " + differenceAndDivision(10, 20));
        System.out.println("The calculation result is: " + fourActs(10, 20));
    }
}
