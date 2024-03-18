package RecuresionMore;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalRec(String str, int s, int e)
    {
        if (s == e)
            return true;
 
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);
 
        return true;
    }
 
    public static boolean isPalindrome(String str)
    {
        int n = str.length();
 
        if (n == 0)
            return true;
 
        return isPalRec(str, 0, n - 1);
    }
}