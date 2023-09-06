package DynamicPrograming;

import java.util.Scanner;

public class CountBinaryStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int preVal0 = 1;
        int preVal1 = 1;

        for (int i = 2; i <= n; i++) {
            int currVal0 = preVal1;
            int currVal1 = preVal0 + preVal1;
            preVal0 = currVal0;
            preVal1 = currVal1;
        }
        System.out.println(preVal0 + preVal1);
    }
}
