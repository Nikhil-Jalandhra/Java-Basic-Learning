package Map.ConcurrentMap;

import java.util.Hashtable;

public class MyHashTable {
    public static void main(String[] args) {
        // HashTable is synchronized => Thread Safe
        // Slower than hash map
        // No null (Key && value)
        // This is legacy class, replaces by Concurrent-Map
        // Only linked-list in case of collision
        Hashtable<Integer, String> myTable = new Hashtable<>(); 
        // myTable.put(1, null); Throw expection
        // myTable.put(null, "sigma"); Throw expection
        myTable.put(1, "One");
    }
}
