package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ReversalOfQueue {
    public static Queue<Integer> reverseQueueFirstKElements(int k, Queue<Integer> queue) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int i=0;
        while (i<k) {
            dq.addFirst(queue.poll());
            i++;
        }
        while (!queue.isEmpty()) {
            dq.addLast(queue.poll());
        }
        return dq;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(reverseQueueFirstKElements(3, q));
    }
}
