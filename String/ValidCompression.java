import java.io.*;
import java.util.*;

public class ValidCompression {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        // int t = Integer.parseInt(read.readLine());
        int t = 1;
        while (t-- > 0) {
            String S = read.readLine();
            String T = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.checkCompressed(S, T));
        }
    }
}

class Solution {
    static int checkCompressed(String s, String t)
    {
        int n = 0;
        boolean flag = true;
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) >= '0' && t.charAt(i) <= '9') {
                n *= 10;
                if (n > 100000)
                    return 0;
                n += (int)t.charAt(i) - '0';
                j--;
            }
            else {
                j += n;
                if (t.charAt(i) != s.charAt(j)) {
                    flag = false;
                    break;
                }
                n = 0;
            }
            j++;
        }
        j += n;
        if (j != s.length())
            flag = false;
 
        if (flag)
            return 1;
        else
            return 0;
    }
}