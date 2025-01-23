package TimeComplexity;
import java.util.Scanner;

public class TC_Example2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the a number of calcualting sum of n natural : ");
        long n = scn.nextLong();
        long sum = 0;

        //Time Complexity O(n)
        // for(int i=1; i<=n; i++){
        //     sum += i;
        // }

        // Time Complexity O(1)
        sum = (n*(n+1))/2;

        System.out.println("Sum of n natural number: "+ sum);
    }
}
