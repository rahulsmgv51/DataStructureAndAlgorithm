package DynamicPrograming;

import java.util.Scanner;

public class KnapsackProblem_0_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            weights[i] = scn.nextInt();
        }
        int capacity = scn.nextInt();

        int[][] dp = new int[n + 1][capacity + 1];

        // i = player, j = ball
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j >= weights[i - 1]) {
                    int remainingCap = j - weights[i - 1];
                    if (dp[i - 1][remainingCap] + values[i - 1] >= dp[i - 1][j]) {
                        dp[i][j] = dp[i - 1][remainingCap] + values[i - 1];
                    } else {
                        dp[i][j] = dp[i - 1][j]; // when player doesn't bat
                    }
                } else {
                    dp[i][j] = dp[i - 1][j]; // when player doesn't bat
                }
            }
        }
        System.out.println(dp[n][capacity]);
    }
}
