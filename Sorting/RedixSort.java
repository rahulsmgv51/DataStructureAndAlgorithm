package Sorting;

import java.util.*;

public class RedixSort {

    public static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int val: arr){
           max = Math.max(val, max);
        }
        int  exp = 1;
        while(exp <= max){
            countSort(arr, exp);
            exp = exp * 10;
        }
    }

    public static void countSort(int[] arr, int exp) {
        int[] freArr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            freArr[arr[i] / exp % exp]++;
        }
        for (int i = 1; i < freArr.length; i++) {
            freArr[i] = freArr[i] + freArr[i - 1];
        }
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {int value = arr[i];
            int position = freArr[arr[i] / exp % exp]-1;
            ans[position] = arr[i];
            // System.out.println("Position of index "+ position + " Insert into value "+ arr[i]);
            freArr[arr[i] / exp % exp]--;
        }

        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }

}