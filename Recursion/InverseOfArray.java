import java.util.Scanner;

public class InverseOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        displayArrReverse(a, n);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx == 0){
            return;
        }
        System.out.println(arr[idx-1]);
        displayArrReverse(arr, idx-1);
    }
}
