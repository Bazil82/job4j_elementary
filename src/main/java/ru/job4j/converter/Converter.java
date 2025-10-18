package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60; /* формула перевода рублей в доллары. */
        return result;
    }

    public static void main(String[] args) {
        float in = 140;
        float exp = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = exp == out;
        System.out.println("140 rubles are 2. Test result: " + passed);
        in = 180;
        exp = 3;
        out = Converter.rubleToDollar(in);
        passed = exp == out;
        System.out.println("180 rubles are 3. Test result: " + passed);
    }
}
