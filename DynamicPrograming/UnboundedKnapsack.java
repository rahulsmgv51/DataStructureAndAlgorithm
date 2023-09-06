package DynamicPrograming;
import java.util.*;

public class UnboundedKnapsack {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] values = new int[n];
        int[] wts = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = scn.nextInt();
        }

        for (int i = 0; i < n; i++) {
            wts[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        int[] dp = new int[cap + 1];
        dp[0] = 0;

        for (int bagc = 1; bagc <= cap; bagc++) {
            int max = 0;
            for (int i = 0; i < n; i++) {

                if (wts[i] <= bagc) {
                    int rbagc = bagc - wts[i];
                    int rbagv = dp[rbagc];
                    int tbagv = rbagv + values[i];

                    if (tbagv > max) {
                        max = tbagv;
                    }
                }
            }
            dp[bagc] = max;
        }
        System.out.println(dp[cap]);
    }
}