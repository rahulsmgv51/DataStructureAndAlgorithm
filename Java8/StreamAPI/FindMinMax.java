package Java8.StreamAPI;

import java.util.Arrays;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {18,32,13,47,54,61,17,38,19};
        /* int[] arr1 = arr.clone();
        arr1[2] = 0;
        arr[1] = 2;
        arr[0] = 1;
        Arrays.stream(arr1).peek(x -> System.out.println(x + "  -")).toArray(); */
        /* int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Min : "+min +", Max : "+ max);
        Arrays.stream(arr).sorted().peek( x -> System.out.println(x)).toArray(); */

        int[] ar = {5,3,9,8,6,2,7};
        Arrays.stream(ar).sorted().filter(x -> x%3 == 0).toArray();
    }
}