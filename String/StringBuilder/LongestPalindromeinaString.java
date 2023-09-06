package StringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LongestPalindromeinaString {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = 1;// Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            // Solution ob = new Solution();
            // SolutionFirsthMethod ob = new SolutionFirsthMethod();
            OddEvenMethod ob = new OddEvenMethod();
            System.out.println(SolutionFirsthMethod.longestPalin(S));
        }
    }
}

class OddEvenMethod {
    static String longestPalin(String S) {
        int l,h;
        int start=0, end =1;
        for(int i=0; i<S.length(); i++){
            l=i-1;
            h=i;

            //Even part
            while(i>=0 && h<S.length() && S.charAt(i)==S.charAt(i+1)){
                if(h-l+1 > end){
                    start=l;
                    end=h-l+1;
                }
                l--;
                h++;
            }

            //Odd part
            l=i-1;
            h=i+1;
            while(i>=0 && h<S.length() && S.charAt(i)==S.charAt(i+1)){
                if(h-l+1 > end){
                    start=l;
                    end=h-l+1;
                }
                l--;
                h++;
            }

        }

        return S.substring(start, start+end-1);
    }
}
class Solution {
    public String longestPalin(String s) {
        List<String> substring = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                // System.out.println(s.substring(i, j));
                substring.add(s.substring(i, j));
            }
        }
        // System.out.println(substring);
        String maxpalindrome = "";
        int maxlen = 0;

        for (int i = 0; i < substring.size(); i++) {
            String substr = substring.get(i);
            int fi = 0, li = substr.length() - 1;
            boolean flag = true;
            // System.out.println("String " + substr);
            while (fi <= li) {
                if (substr.charAt(fi) != substr.charAt(li)) {
                    flag = false;
                }
                fi++;
                li--;
            }
            if (flag && substr.length() > maxlen) {
                maxpalindrome = substr;
                maxlen = substr.length();
            }

        }
        return maxpalindrome;
    }

}

class SolutionFirsthMethod {
    static String longestPalin(String S) {
        int fi = 0, fj = 0, j, k, n = S.length();

        for (int i = 0; i < n; ++i) {
            // odd length palindrome with current index as center
            j = i - 1;
            k = i + 1;
            System.out.println(" value of i "+i+", j "+j+", k "+k);
            while (j >= 0 && k < n) {
                System.out.println(S.charAt(j) +"  <--- S.charAt(j)  S.charAt(k)---> "+ S.charAt(k));
                if (S.charAt(j) != S.charAt(k))
                    break;
                j--;
                k++;
                System.out.println("odd case while loop value of  j "+j+", k "+k);
            }

            System.out.println( (k - j - 1) +" <--- k-j-1 , fj - fi + 1 ---> "+ (fj - fi + 1));
            if (k - j - 1 > fj - fi + 1) {
                fi = j + 1;
                fj = k - 1;
                System.out.println(" value of  fi "+fi+", fj "+fj);
            }

            // even length palindrome if possible
            if (i < n - 1 && S.charAt(i) == S.charAt(i + 1)) {
                System.out.println(S.charAt(i) +"  <--- S.charAt(i)  S.charAt(i+1)---> "+ S.charAt(i+1));
                j = i - 1;
                k = i + 2;
                System.out.println("even case value of i "+i+", j "+j+", k "+k);
                while (j >= 0 && k < n) {
                    if (S.charAt(j) != S.charAt(k))
                        break;
                    j--;
                    k++;
                    System.out.println("even case while loop value of  j "+j+", k "+k);
                }
                if (k - j - 1 > fj - fi + 1) {
                    fi = j + 1;
                    fj = k - 1;
                    System.out.println("even case value of  fi "+fi+", fj "+fj);
                }
            }
            System.out.println("\n\n\n");
        }

        return S.substring(fi, fj + 1);

    }
}

class SolutionSecondMethod {
    static String longestPalin(String S) {
        int start = 0;
        int maxvalue = 1;
        int n = S.length();
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++)// for length=1;
        {
            dp[i][i] = true;
        }
        for (int i = 0; i < n - 1; i++)// for length=2;
        {
            if (S.charAt(i) == S.charAt(i + 1)) {
                dp[i][i + 1] = true;
                maxvalue = 2;
            }
        }
        for (int k = 3; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                int j = i + k - 1;
                if (S.charAt(i) == S.charAt(j) && dp[i + 1][j - 1] == true) {
                    dp[i][j] = true;
                    if (k > maxvalue) {
                        maxvalue = k;
                        start = i;
                    }
                }
            }
        }
        if (maxvalue == 1) {
            return Character.toString(S.charAt(0));
        } else if (maxvalue == 2) {
            for (int i = 0; i < n - 1; i++) {
                if (S.charAt(i) == S.charAt(i + 1)) {
                    String p = "";
                    p = p + S.charAt(i) + S.charAt(i + 1);
                    return p;
                }
            }
        } else {
            String str = showstring(S, start, start + maxvalue - 1);
            return str;
        }
        return "nofound";
    }

    public static String showstring(String str, int a, int b) {
        return (str.substring(a, b + 1));
    }
}
