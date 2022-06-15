package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int res = left >= right ? left : right;
        return res;
    }

    public static void main(String[] args) {
        int a = max(6, 5);
        System.out.println(a);
    }
}
