package Stacks;
import java.util.Stack;

public class StackIntro {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
                continue;
            }

            if (st.isEmpty()) {
                return false;
            }
            char check;
            switch (ch) {
                case ')':
                    check = st.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;
                case '}':
                    check = st.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;
                case ']':
                    check = st.pop();
                    if (check == '(' || check == '{') {
                        return false;
                    }
                    break;
            }
        }
        return (st.isEmpty());
    }

    public static void main(String[] args) throws Exception {
        System.out.println(isValid("(]"));
        // Stack<Integer> st = new Stack<>();

        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // st.push(5);
        // System.out.println("Stack Data : " + st);
        // st.pop();
        // System.out.println("Stack Data after POP : " + st);
    }
}
