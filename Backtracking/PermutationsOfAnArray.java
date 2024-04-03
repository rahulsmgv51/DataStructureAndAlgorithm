package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfAnArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(Solution.permute(nums));
        // System.out.println(perm);
        // }
    }
}

class Solution {
    static List<List<Integer>> list;

    public static List<List<Integer>> permute(int[] nums) {
        list = new ArrayList<>();
        permute1(nums, 0, nums.length - 1);

        list.sort((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) != b.get(i)) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        return list;

    }

    public static void permute1(int a[], int l, int r) {
        if (l == r) {
            List<Integer> val = new ArrayList();
            for (int i : a)
                val.add(i);
            list.add(val);
            return;
        }

        for (int i = l; i <= r; i++) {
            swap(a, i, l);
            permute1(a, l + 1, r);
            swap(a, i, l);
        }

    }

    public static void swap(int a[], int i, int l) {
        int temp = a[i];
        a[i] = a[l];
        a[l] = temp;
    }

}
