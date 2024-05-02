package Stacks;

import java.util.ArrayDeque;

public class BalancedParantheses {
    public static int isBalanced(String str) {
        if (str.length()%2 != 0) {
            return 0;
        }
        Stack_usingLinkedList stack = new Stack_usingLinkedList(); // It is work on MyStack because in Mystack is store
                                                                   // character data convert into integer then push
        // ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }
                stack.pop();
            }
        }

        return (stack.isEmpty()) ? 1 : 0;
    }

    public static void main(String[] args) {
        String A = "(()";
        System.out.println(isBalanced(A));
    }
}