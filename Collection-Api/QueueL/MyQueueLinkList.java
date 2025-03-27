package QueueL;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MyQueueLinkList {
    public static void main(String[] args) {
        // There are two principles LIFO || FIFO
        // Queue work on FIFO(First in First out)
        // Adding elements (enqueue) -- Removing elements (dequeue)
        Queue<Integer> list = new LinkedList<>();
        list.add(8);
        list.add(3);
        list.add(6);
        list.add(9);

        System.out.println(list.remove()); // throws expection if empty
        System.out.println(list.poll());

        System.out.println(list.element()); // throws expection if empty
        System.out.println(list.peek());

        System.out.println(list);

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(/*3*/ 4);
        queue2.add(8);
        queue2.add(3);
        queue2.add(5);

        System.out.println(queue2.add(6)); // throws expection if no space
        System.out.println(queue2.offer(4));

    }
}