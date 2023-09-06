package DynamicPrograming;

import java.util.Scanner;

public class ArrangeBuildings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
        int  countB = 1;
        int  countS = 1;

        for(int i=2; i<=n; i++){
            int newCountB = countS;
            int newCountS = countB+countS;

            countB = newCountB;
            countS = newCountS;
        }

        long total = countB+countS;
        total = total*total;
        System.out.println("Total ways of Building and Space "+total);
    }
}
