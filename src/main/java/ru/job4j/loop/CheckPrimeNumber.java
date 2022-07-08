package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean prime = true;
        if (num < 2) {
            prime = false;
        }
        for (int index = 2; index < num; index++) {
            if ((num % index) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
