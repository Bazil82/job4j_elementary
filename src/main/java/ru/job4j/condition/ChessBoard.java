package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(y1) && isValid(x2) && isValid(y2)) {
            if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                rsl = Math.abs(x1 - x2);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static void main(String[] args) {
        int x1 = 6;
        int y1 = 7;
        int x2 = 1;
        int y2 = 2;
        System.out.println(ChessBoard.way(x1, y1, x2, y2));
    }
}
