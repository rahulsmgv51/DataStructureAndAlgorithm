package DynamicPrograming;

import java.util.Scanner;

public class PaintHouse_ManyColors2ndMethod{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[n][c];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] dp = new int[n][c];
        for(int j=0; j<dp[0].length; j++){
            dp[0][j] = arr[0][j];
        }

        for(int i=1; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                int min = Integer.MAX_VALUE;
                for(int k=0; k<dp[0].length; k++){
                    if(j != k ){
                        if(dp[i-1][k] < min){
                            min = dp[i-1][k];
                        }
                    }
                }
                dp[i][j] = arr[i][j] + min;
            }
        }

        int minCost = Integer.MAX_VALUE;
        for(int j=0; j<dp[0].length; j++){
            if(dp[n-1][j] < minCost){
                minCost = dp[n-1][j];
            }
        }
        System.out.println(minCost);
    }
}