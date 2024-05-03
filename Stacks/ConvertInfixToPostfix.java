package Stacks;

import java.util.ArrayDeque;

public class ConvertInfixToPostfix {

    public static int precedence(String string) {
        switch (string) {
            case "^":
                return 3;
            case "*":
            case "/":
                return 2;
            case "+":
            case "-":
                return 1;
            default:
                return -1;
        }
    }

    public static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^");
    }

    public static String infixToPostfix(String str) {
        // String[] tokens = str.split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        // for (String token : tokens) {
        for(int i=0; i<str.length(); i++){
            String token = str.charAt(i)+""; 
            if (token.equals("(")) {
                stack.push(token);
            } else if (isOperator(token)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(token)) {
                    String temp = stack.pop();
                    sb.append(temp);
                }
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    String temp = stack.pop();
                    sb.append(temp);
                }
                stack.pop();
            } else { // Operand
                sb.append(token);
            }

        }

        while (!stack.isEmpty()) {
            String temp = stack.pop();
            sb.append(temp);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(str));
    }
}