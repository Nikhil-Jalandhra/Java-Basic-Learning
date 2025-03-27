package QueueL;
import java.util.PriorityQueue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        // part of the queue interface
        // ordere elements based on there natural ordering ( for primitive lowest first )
        // custom comparator for customised ordering
        // does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(15);
        pq.add(30);
        pq.add(5);
        System.out.println(pq);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        // internal working
        // Priority Queue is implemented as a min-heap by default (for - natural ordering)

    }
}
