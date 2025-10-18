package ru.job4j.calculator;

public class Fit {
    public enum Gender {
        MALE, FEMALE
    }

    public static double idealWeight(int height, Gender gender) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero");
        }
        int base = gender == Gender.MALE ? 100 : 110;
        return (height - base) * 1.15;
    }

    public static void main(String[] args) {
        int heightMan = 187;
        int heightWoman = 170;

        double man = Fit.idealWeight(heightMan, Gender.MALE);
        double woman = Fit.idealWeight(heightWoman, Gender.FEMALE);

        System.out.printf("Ideal weight for man (%d cm): %.2f kg%n", heightMan, man);
        System.out.printf("Ideal weight for woman (%d cm): %.2f kg%n", heightWoman, woman);
    }
}
