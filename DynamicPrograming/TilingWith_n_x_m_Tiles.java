package DynamicPrograming;

import java.util.Scanner;

public class TilingWith_n_x_m_Tiles {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();

        int[] dp = new int[N+1];

        for(int Ni=1; Ni<=N; Ni++){
            if(Ni < M){
                dp[Ni] = 1;
            }
            else if(Ni == M){
                dp[Ni] = 2;
            }
            else{
                dp[Ni] = dp[Ni-1] + dp[Ni-M];
            }
        }
        System.out.println(dp[N]);
    }
}
