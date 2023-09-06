package DynamicPrograming;
import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cp = countPaths(n, new int[n+1]);
        System.out.println(cp);
    }

    private static int countPaths(int n, int[] qb) {
        if(n==0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }
        else if(qb[n] > 0){
            return qb[n];
        }
        // System.out.println("hello "+ n); 
        int cpn1 = countPaths(n-1, qb);
        int cpn2 = countPaths(n-2, qb);
        int cpn3 = countPaths(n-3, qb);
        int cpn = cpn1+cpn2+cpn3;
        qb[n] = cpn;

        return cpn;
    }
}
