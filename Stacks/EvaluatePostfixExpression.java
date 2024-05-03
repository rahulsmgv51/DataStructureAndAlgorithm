package Stacks;

import java.util.ArrayDeque;

public class EvaluatePostfixExpression {
    static int evaluatePostfix(String str) {
        String tokens[] = str.split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (isOperator(token)) {
                int second = stack.pop();
                int frist = stack.pop();
                int res = 0;
                switch (token) {
                    case "+":
                        res = frist + second;
                        break;
                    case "-":
                        res = frist - second;
                        break;
                    case "*":
                        res = frist * second;
                        break;
                    case "/":
                        res = frist / second;
                        break;
                    case "^":
                        res = (int) Math.pow(frist, second);
                        // res = powerFunction(frist, second);
                        break;
                }
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private static int powerFunction(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int xnb2 = powerFunction(x, n / 2);
        int xn = xnb2 * xnb2;
        if (n % 2 == 1) {
            xn = xn * x;
        }
        return xn;
    }

    private static boolean isOperator(String token) {
        return (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^"));
    }

    public static void main(String[] args) {
        String str = "4 13 5 / +";
        System.out.println(evaluatePostfix(str));
    }
}