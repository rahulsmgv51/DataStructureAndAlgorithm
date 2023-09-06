import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(firstOccur(arr, 0, x));
    }

    private static int firstOccur(int[] arr, int i, int x) {
        if (i == arr.length) {
            return -1;
        }
        if(arr[i] == x){
            return i;
        }
        else{
            int fi = firstOccur(arr, i + 1, x);
            return fi;
        }
    }
}
