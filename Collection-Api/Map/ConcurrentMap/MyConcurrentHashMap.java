package Map.ConcurrentMap;

import java.util.concurrent.ConcurrentHashMap;

public class MyConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> myConcurrent = new ConcurrentHashMap<>();
        myConcurrent.put(1, "One");

        // JAVA 7 ==> segment based locking ==> 16 segments => suitable for smaller hashmap
        // only the segement being written to or read from is locked
        // read: do not require locking unless there is a write opperation happening on the same segment
        // write: lock

        // JAVA 8 -> no segmentation
        //        -> compare-and-swap approch --> no locking except resizing or collison
        // On write
        // Thread A last saw --> x => 45
        // if x is still 45, then change it to 50 else don't change to retry
        // put --> index

    }
}
