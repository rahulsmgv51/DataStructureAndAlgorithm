package Function;

import java.util.Scanner;

public class InvertedBar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println("MAX ___ "+max);
        
        for(int i=0; i<max; i++){
            for(int j=0; j<a.length; j++){
                if(a[j]-- > 0){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
