package QueueL;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class MyDeque {
    public static void main(String[] args) {
        // Double-ended queue
        // allows intersection and removal of elements from both ends

        // add and offer working same but depend on first||last      -:-  INSERTION METHOD
        // remove and poll working same but depend on first||last      -:-  REMOVAL METHOD
        // get and peek --> peek return null if empty      -:-  EXAMINATION METHOD
        // push and pop --> for first element      -:-  STACK METHOD

        Deque<Integer> queue = new ArrayDeque<>(); // faster iteration, low memory, no null allowed
        queue.add(1);
        // circular, head and tail
        //  no need to shift element just shift head and tail
        
        Deque<Integer> queue1 = new LinkedList<>(); // insertion, deletion somewhere in middle
        queue1.add(1);

    }
}
