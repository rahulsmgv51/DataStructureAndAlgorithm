package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.util.Scanner;

public class GenerateBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        System.out.println(AllParenthesis(n));
    }

    public static List<String> AllParenthesis(int n) {
        List<String> ans = new ArrayList();
        return generateBracket(n, "", 0, 0, 0, ans);
    }

    public static List<String> generateBracket(int n, String cur, int i, int open, int close, List<String> ans){
        if(i == 2*n){
            ans.add(cur);
            return ans;
        }
        if(open < n){
            cur = cur + '(';
            generateBracket(n, cur, i+1, open+1, close, ans);
            cur = cur.substring(0, cur.length()-1);
        }

        if(close < open){
            cur = cur + ')';
            generateBracket(n, cur, i+1, open, close+1, ans);
        }

        return ans;
    }
}