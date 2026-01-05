package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean res = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                res = false;
                break;
            }
        }
        return res;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean res = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                res = false;
                break;
            }
        }
        return res;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean res = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && (monoHorizontal(board, i) || monoVertical(board, i))) {
                res = true;
                break;
            }
        }
        return res;
    }
}
