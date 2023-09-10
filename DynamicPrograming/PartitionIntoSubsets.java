package DynamicPrograming;

import java.util.Scanner;

public class PartitionIntoSubsets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // People
        int k = scn.nextInt(); // Teams

        if (n == 0 || k == 0 || n < k) {
            System.out.println(0);
            return;
        }
        int[][] dp = new int[k+1][n+1];

        for(int team=1; team<=k; team++){
            for(int people=1; people<=n; people++){
                if(people<team){
                    dp[team][people] = 0;
                }
                else if(people == team){
                    dp[team][people] = 1;
                }
                else{
                    dp[team][people] = team * dp[team][people-1] + dp[team-1][people-1];
                }
            }
        }
        System.out.println(dp[k][n]);
    }
}
