package Collection_Framewok;

import java.util.ArrayDeque;

public class Queue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offerFirst(20);
        dq.addLast(30);
        System.out.println(dq); //[20,10,30]
        // Deque have multiple method for inserting element as well as for deletion
    }
}