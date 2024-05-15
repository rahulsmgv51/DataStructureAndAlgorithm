package Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximum {

    public static List<Integer> maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int i=0; 
        while (i<k) {
            while (!dq.isEmpty() && dq.getLast() < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(nums[i]);
            i++;
        }

        int n = nums.length;
        int[] ans = new int[n-k+1];
        for(; i<n; i++){
            ans[i-k] = dq.peekFirst();
            if (nums[i-k] == dq.peekFirst()) {
                dq.pollLast();
            }
            while (!dq.isEmpty() && dq.getLast() < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(nums[i]);
        }
        ans[n-k] = dq.peekFirst();

        List<Integer> res = new ArrayList<>();
        for(int l=0; l<ans.length; l++){
            res.add(l, ans[l]);
        }
        
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {3, 4, -2, 1};
        System.out.println(maxSlidingWindow(nums, 2));
    }
}