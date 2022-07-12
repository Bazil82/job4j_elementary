package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        percent /= 100;
        int year = 0;
        while (amount > 0) {
            amount = amount + (amount * percent);
            amount -= salary;
            year++;
        }
        return year;
    }
}
