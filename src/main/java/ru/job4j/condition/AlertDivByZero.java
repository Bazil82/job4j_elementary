package ru.job4j.condition;

public class AlertDivByZero {
    public static void possibleDiv(int num) {
        if (num == 0) {
            System.out.println("Could not div by 0");
        }
        if (num < 0) {
            System.out.println("This is negative number");
        }
    }

    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-4);
    }
}
