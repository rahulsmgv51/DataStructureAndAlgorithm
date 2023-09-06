import java.util.Scanner;
public class PrintZigZag {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
    }

    private static void pzz(int n) {
        if(n==0){
            return ;
        }
        System.out.println("pre "+n);
        pzz(n-1);
        System.out.println("In "+n);
        pzz(n-1);
        System.out.println("Post "+n);
    }
}
