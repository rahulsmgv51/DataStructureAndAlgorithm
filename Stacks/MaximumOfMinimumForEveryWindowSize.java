package Stacks;

import java.util.ArrayDeque;
import java.util.Arrays;

public class MaximumOfMinimumForEveryWindowSize {

    public static int[] maxOfMin(int[] arr, int n) {
        int left[] = smallerOnLeft(arr);
        int rigth[] = smallerOnRigth(arr);

        int ans[] = new int[n];
        Arrays.fill(ans, Integer.MIN_VALUE);

        for (int i = 0; i < n; i++) {
            int wl = rigth[i] - left[i] - 1;
            ans[wl - 1] = Math.max(ans[wl - 1], arr[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.max(ans[i], ans[i + 1]);
        }

        return ans;
    }

    private static int[] smallerOnRigth(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = n;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }

    private static int[] smallerOnLeft(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 6, 4, 10, 2, 4 };
        int[] ans = maxOfMin(arr, arr.length);

        for (int e : ans) {
            System.out.print(e + " ");
        }
    }
}