package Array;

import java.util.Scanner;

class SumOfTwoArray {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        SumOfTwoArray obj = new SumOfTwoArray();

        for (int i : obj.twoSum(arr, d)) {
            System.out.println(i);
        }
    }
}