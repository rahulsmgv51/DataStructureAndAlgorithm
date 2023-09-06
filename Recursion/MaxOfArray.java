import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        System.out.println(maxOfArray(a, 0));
    }

    public static int maxOfArray(int[] arr, int idx) {
        if(idx == arr.length-1){
            return arr[idx];
        }
        int misa = maxOfArray(arr, idx+1);
        if(misa > arr[idx]){
            return misa;
        }
        else{
            return arr[idx];
        }
    }
}
