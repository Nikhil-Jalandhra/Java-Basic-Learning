package QueueL;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyBlockingQueue {
    public static void main(String[] args) {
        // thread-safe queue
        // wait for queue to become non-empty / wait for space
        // simplify concurrency problems like producer-consumer
        
        // standard queue --> immediately
            // empty --> remove ( no waiting )
            // full --> add ( no waiting )
        
        // Blocking queue
            // put --> Blocks if the queue is full until space becomes available
            // take --> Blocks if the queue is empty until an elements becomes available
            // offer --> Waits for space to become available, up to the specified timeout

            BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
    }
}
