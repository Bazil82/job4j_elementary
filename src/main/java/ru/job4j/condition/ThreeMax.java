package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int res = third;
        if (first >= second && first >= third) {
            res = first;
        } else if (second >= first && second >= third) {
            res = second;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2, 3));
    }
}
