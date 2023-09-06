import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        if(n==0 || n==1){
            return n;
        }

        int fibon1 = fibo(n-1);
        int fibon2 = fibo(n-2);
        int fibn = fibon1 + fibon2;
        return fibn;
    }
}
