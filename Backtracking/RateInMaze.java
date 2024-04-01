package Backtracking;

import java.util.*;

class Solution {

    public static ArrayList<String> findPath(int[][] arr, int n) {
        boolean[][] visited = new boolean[n][n];
        ArrayList<String> ans = new ArrayList<>();
        if (arr[0][0] == 1 && arr[n - 1][n - 1] == 1) {
            return (mazePath(arr, 0, 0, "", visited, ans));
        }
        return new ArrayList<>();
    }

    public static ArrayList<String> mazePath(int maze[][], int row, int col, String psf, boolean visited[][],
            ArrayList<String> ans) {

        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 0
                || visited[row][col] == true) {
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            ans.add(psf);
            return ans;
        }
        visited[row][col] = true;
        // Print in Lexographical order
        mazePath(maze, row + 1, col, psf + "D", visited, ans); //Down
        mazePath(maze, row, col - 1, psf + "L", visited, ans); //Left
        mazePath(maze, row, col + 1, psf + "R", visited, ans); //Right
        mazePath(maze, row - 1, col, psf + "U", visited, ans); //Up
        visited[row][col] = false;

        return ans;
    }
}

public class RateInMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Solution.findPath(arr, n));
    }

    // public static ArrayList<String> mazePath(int maze[][], int row, int col,
    // String psf, boolean visited[][] , ArrayList<String> ans) {

    // if (row < 0 || col < 0 || row == maze.length || col == maze[0].length ||
    // maze[row][col] == 0 || visited[row][col] == true) {
    // ArrayList<String> baseCase = new ArrayList<>();
    // baseCase.add("");
    // return baseCase;
    // }
    // if (row == maze.length - 1 && col == maze[0].length - 1) {
    // ans.add(psf);
    // return ans;
    // }
    // visited[row][col] = true;

    // mazePath(maze, row - 1, col, psf + "U", visited, ans);
    // mazePath(maze, row + 1, col, psf + "D", visited, ans);
    // mazePath(maze, row, col - 1, psf + "L", visited, ans);
    // mazePath(maze, row, col + 1, psf + "R", visited, ans);
    // visited[row][col] = false;
    // return ans;
    // }
}