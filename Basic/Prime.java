package Basic;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int flag = 1;

        for (int div = 2; div * div < n; div++) {
            if (n % div == 0) {
                flag = 0;
            }
        }

        System.out.println("Prime " + flag);
    }
}