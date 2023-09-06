package Function;

import java.util.Scanner;

public class SubSetofArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int limits = (int) Math.pow(2, a.length);

        for(int i=0; i<limits; i++){
            String set = "";
            int tmp = i;
            for(int j=a.length-1; j>=0; j--){
                int r = tmp%2;
                tmp = tmp/2;
                if(r==0){
                    set = "-\t" + set;
                }
                else{
                    set = a[j]+"\t"+set;
                }
            }
            System.out.println(set);
        }

    }
}
