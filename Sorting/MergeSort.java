package Sorting;
import java.util.*;

public class MergeSort {
    public static int[] mergeSort(int[] arr, int lo, int hi) {
        if(lo == hi){
            int[] base = new int[1];
            base[0] = arr[lo];
            return base;
        }
        int mid = (lo + hi)/2;
        int[] fsa = mergeSort(arr, lo, mid);
        int[] ssa = mergeSort(arr, mid+1, hi);
        int[] sortedArr = mergeTwoSortedArrays(fsa, ssa);
        return sortedArr;
    }

    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            System.out.println("Compare " + a[i] + " and " + b[j] + " i " + i + " j " + j + " k " + k);
            if (a[i] < b[j]) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            System.out.println("Compare " + a[i] + " and " + b[j - 1] + " i " + i + " j " + j + " k " + k);
            arr[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            System.out.println("Compare " + a[i - 1] + " and " + b[j] + " i " + i + " j " + j + " k " + k);
            arr[k] = b[j];
            j++;
            k++;
        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] sa = mergeSort(arr, 0, arr.length - 1);
        print(sa);
    }
}