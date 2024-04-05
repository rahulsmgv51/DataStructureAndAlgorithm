package Backtracking;

import java.util.*;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aab";
        Solution obj = new Solution();
        List<List<String>> result = obj.partition(s);
        System.out.println(result);
        // System.out.println("All possible palindrome partitionings of " + s + "
        // are:");
        // for (List<String> partition : result) {
        // System.out.println(partition);
        // }
    }
}

class Solution {
    public boolean isPalindrome(String s, int start, int end) {
        while (start < end) {

            if (s.charAt(start) != s.charAt(end))
                return false;

            start++;

            end--;
        }

        return true;
    }

    public void backtrack(String s, List<List<String>> res, List<String> curr, int start) {

        if (start == s.length()) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < s.length(); i++) {

            if (isPalindrome(s, start, i)) {
                curr.add(s.substring(start, i + 1));
                backtrack(s, res, curr, i + 1);
                curr.remove(curr.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        backtrack(s, res, curr, 0);
        return res;
    }
}