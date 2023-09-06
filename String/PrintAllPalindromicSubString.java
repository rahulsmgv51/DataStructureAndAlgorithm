import java.util.Scanner;

public class PrintAllPalindromicSubString {
    public static void solution(String str) {
        int max = 0;
        String maxPa = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                // System.out.println(str.substring(i, j));
                if(isPalindrome(str.substring(i, j))){
                    String s = str.substring(i, j);
                    int len = s.length();
                    System.out.println("Str  "+s + " len "+len);
                    if(len > max){
                        maxPa = s;
                        max = len;
                    }
                }
            }
        }
        System.out.println(maxPa);
     
    }

    public static boolean isPalindrome(String str){
        int i=0, j=str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
             i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}