package Basic;

import java.util.Scanner;

public class N_C_R {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        Solution11 obj = new Solution11();
        System.out.println(obj.nCr(n, r));
    }
}

class Solution11 {
    static int nCr(int n, int r) {
        if (r > n)
            return 0;

        int mod = 1000000007;
        int dp[] = new int[r + 1];
        for (int i = 1; i <= n; i++) {
            dp[0] = 1;
            for (int j = r; j > 0; j--) {
                System.out.println("dp["+j+"] " + (dp[j] + dp[j - 1]) % mod + " dp["+j+"] " + dp[j] + " dp["+(j-1)+"] " + dp[j-1]);
                dp[j] = (dp[j] + dp[j - 1]) % mod;
            }
        }
        return dp[r];
    }
}
