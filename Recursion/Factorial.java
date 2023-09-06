import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        System.out.println("Value of n "+n);
        if(n==1){
            return 1;
        }
        int fn = factorial(n-1);
        System.out.println("Value of fn "+ fn);
        int f = n*fn;
        System.out.println("Return value "+f);
        return f;
    }
}
