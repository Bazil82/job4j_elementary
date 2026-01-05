package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        System.out.println("Array size ages: " + ages.length);
        System.out.println("Array sizes surnames: " + surnames.length);
        System.out.print("Array sizes prices: " + prices.length);
        System.out.println();
        System.out.println();

        names[0] = "Timothy Cain";
        names[1] = "Leonard Boyarsky";
        names[2] = "Christopher Taylor";
        names[3] = "Chris Jones";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
