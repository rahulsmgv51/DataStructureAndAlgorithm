package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N_Queens {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        solveNQueensHelper(result, board, 0);
        return result;
    }

    private void solveNQueensHelper(List<List<String>> result, char[][] board, int row) {
        if (row == board.length) {
            List<String> solution = new ArrayList<>();
            for (char[] rowArray : board) {
                solution.add(new String(rowArray));
            }
            result.add(solution);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                solveNQueensHelper(result, board, row + 1);
                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
            int diff = row - i;
            if (col - diff >= 0 && board[i][col - diff] == 'Q') {
                return false;
            }
            if (col + diff < board.length && board[i][col + diff] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        N_Queens solver = new N_Queens();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<List<String>> solutions = solver.solveNQueens(n);
        System.out.println(solutions);
        // for (int i = 0; i < solutions.size(); i++) {
        //     System.out.println("Solution " + (i + 1) + ":");
        //     for (String row : solutions.get(i)) {
        //         System.out.println(row);
        //     }
        //     System.out.println();
        // }
    }
}