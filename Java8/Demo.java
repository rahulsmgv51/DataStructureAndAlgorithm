package Java8;

import java.util.Scanner;
class Solution{
    public static int nCr(int n ,int r){
        if(n==r || r==0)return 1;

        return nCr(n-1, r-1) + nCr(n-1, r);
    }
}

public class Demo {
    public static int x =10;
    public static void myFunction(){
        x =15;
    }
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.substring(7,12));
        // int x = 10;
        // System.out.println(x + " ");
        // myFunction();
        // System.out.println(x + " ");
        // int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        // int target = 5;
        // boolean found = false;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[i].length; j++){
        //         if(matrix[i][j] == target){
        //             found = true;
        //             break;
        //         }
        //     }
        //     if (found) {
        //         break;
        //     }
        // }
        // System.out.println(found);
        // String str = "Java";
        // System.out.println(str.contains(null));
        // Solution obj = new Solution();
        // System.out.println(obj.nCr(20, 10));
        // String str = "Java";
        // System.out.println(str.contains(""));
        // String[] words = str.split("a");
        // System.out.println(words.length);
        // String str = new String("Java");
        // String str1 = new String("Java");
        // System.out.println(str == str1);
        // System.out.println(str.contains(" World ")+" ");
        // System.out.println(str.isEmpty());
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // System.out.println(nthFibonacci(n));
    }

    // public static int nthFibonacci(int n) {
    //     int a = 0;
    //     int b = 1;
    //     int nthFibonacciVal = a+b; 
    //     for(int i=1; i<n; i++){
    //         nthFibonacciVal = a+b; 
    //         a=b; 
    //         b=nthFibonacciVal;
    //     }
    //     return nthFibonacciVal;
    // }
}