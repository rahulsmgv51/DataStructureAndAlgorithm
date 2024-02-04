import java.util.Scanner;
import java.util.Stack;

public class BalanceBrackets {
    public static boolean isHandle(Stack<Character> st, char corresoch) {
        if (st.size() == 0) {
            // System.out.println(false);
            return false;
        } else if (st.peek() != corresoch) {
            // System.out.println(false);
            return false;
        } else {
            st.pop();
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = isHandle(st, '(');
                if (val == false) {
                    // System.out.println(val);
                    return;
                }
            } else if (ch == '}') {
                isHandle(st, '{');
                boolean val = isHandle(st, '(');
                if (val == false) {
                    // System.out.println(val);
                    return;
                }
            } else if (ch == ']') {
                isHandle(st, '[');
                boolean val = isHandle(st, '(');
                if (val == false) {
                    // System.out.println(val);
                    return;
                }
            }
        }
        if(st.size() == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}