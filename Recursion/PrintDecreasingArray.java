import java.util.Scanner;

public class PrintDecreasingArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scn.nextInt();
        }
        displayArr(a, n);
    }

    public static void displayArr(int[] arr, int idx) {
        if(idx == 0){
            return;
        }
        displayArr(arr, idx-1);
        System.out.println(arr[idx-1]); 
    }
}
