import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        // System.out.println(lastOccur(arr, arr.length-1, x));
        System.out.println(lastOccur(arr, 0, x));
    }

    private static int lastOccur(int[] arr, int idx, int x) {
        if(idx == arr.length){
            return -1;
        }
        int liisa = lastOccur(arr, idx+1, x);
        if( liisa == -1){
            if(arr[idx] == x){
                return idx;
            }
            else{
                return -1;
            }
        }
        else{
            return liisa;
        }
    }

    // private static int lastOccur(int[] arr, int i, int x) {
    // if(i < 0){{
    // return -1;
    // }

    // }
    // if(arr[i] == x){
    // return i;
    // }
    // else{
    // int liisa = lastOccur(arr, i-1, x);
    // return liisa;
    // }
    // }
}
