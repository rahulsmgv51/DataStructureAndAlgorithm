package Sorting;
import java.util.*;

public class CountSorting {
    public static void countSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] freArr = new int[range];

        for (int i = 0; i < arr.length; i++) {
            freArr[arr[i] - min]++;
        }
        for (int i = 1; i < freArr.length; i++) {
            freArr[i] = freArr[i] + freArr[i - 1];
        }
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int value = arr[i];
            int position = freArr[value - min]-1;
            ans[position] = arr[i];
            // System.out.println("Position of index "+ position + " Insert into value "+ arr[i]);
            freArr[value - min]--;
        }

        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr, min, max);
        print(arr);
    }
}