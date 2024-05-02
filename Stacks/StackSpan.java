package Stacks;

import java.util.ArrayDeque;

public class StackSpan {
    static int[] stockSpan(int a[], int n){
        int s[] = new int[n];

        s[0] = 1;
        MySapnStack stack = new MySapnStack();
        // ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);

        for(int i=1; i<n; i++){
            while (!stack.isEmpty()) {
                int top = stack.peek();
                if (a[top] > a[i]) {
                    break;
                }else{
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                s[i] = i+1;
            }
            else{
                s[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return s;
    }

    public static void main(String[] args) {
        int[] a = {100, 80, 60, 70,60,75,85};
        int n = a.length;
        int s[] = stockSpan(a, n);
        for (int i : s) {
            System.out.print(i+" ");
        }
    }
}
/*
Here's the complete approach, along with time and space complexity:

Algorithm: This code uses a stack to efficiently calculate the span for each day.

Initialize an integer array S to store the span values, and a stack st to keep track of the indices of the days.

Push the index of the first day (0) onto the stack and set the span for the first day (S[0]) to 1, as there's no previous day to compare to.

Iterate through the remaining days (from i = 1 to n - 1).

For each day i, pop elements from the stack (representing previous days) while the stock price for the current day (price[i]) is greater than or equal to the stock price for the day at the top of the stack (price[st.peek()]). This loop accounts for all consecutive days with lower or equal prices.

Calculate the span for the current day (S[i]) as the difference between the current day's index (i) and the index at the top of the stack after popping elements. If the stack is empty after popping, it means there are no previous days with prices greater than or equal to the current day, so the span is simply i + 1.

Push the index of the current day (i) onto the stack to keep track of it for future calculations.

Repeat steps 4-6 for all days.

The S array will now contain the spans for all days, and you can return it as the result.

Time Complexity: The time complexity of this algorithm is O(n), where n is the number of days. This is because each day is pushed onto the stack once and popped from the stack once.

Space Complexity: The space complexity is O(n) as well. In the worst case, the stack could contain all n indices.
 */