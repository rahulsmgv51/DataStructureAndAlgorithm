import java.util.Scanner;

public class PowerCal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        System.out.println(powerOf(n, p));
    }

    private static int powerOf(int n, int p) {
        if(p == 0){
            return 1;
        }

        int xn1 = powerOf(n, p-1);
        int x = n*xn1;
        return x;
    }
}
