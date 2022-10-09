package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int j = 0; j < board.length; j++) {
            if (board[j][column] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }
}

