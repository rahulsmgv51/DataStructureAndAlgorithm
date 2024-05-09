package Stacks;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class PreviousSmallerElement {
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> idx = new ArrayList<>();
        for (int i = 1; i < A.size(); i++) {
            while (!stack.isEmpty() && A.get(stack.peek()) >= A.get(i)) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                idx.add(-1);
            } else {
                idx.add(stack.peek());
            }
            stack.push(i);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < idx.size(); i++) {
            if (idx.get(i) == -1) {
                res.add(-1);
            } else {
                int tmp = idx.get(i);
                int ele = A.get(tmp);
                res.add(ele);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(-63);
        list.add(15);
        list.add(-35);
        list.add(37);
        list.add(88);
        list.add(80);
        list.add(43);
        list.add(58);
        list.add(75);
        list.add(12);
        list.add(-55);
        list.add(-88);
        list.add(26);
        list.add(81);
        list.add(63);
        list.add(-42);
        list.add(78);
        list.add(-100);
        System.out.println(prevSmaller(list));
    }
}