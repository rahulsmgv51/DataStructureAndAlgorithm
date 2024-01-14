import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static boolean isDuplicate(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(isDuplicate(str));
    }
}