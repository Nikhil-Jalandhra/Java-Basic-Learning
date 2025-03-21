package Map.SortedMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class MyNavigable {
    public static void main(String[] args) {
        // It extend sorted map, means it gives us a sorted array
        // 
        NavigableMap<Integer, String> myNavigable = new TreeMap<>();
        myNavigable.put(1, "One");
        myNavigable.put(5, "Five");
        myNavigable.put(3, "Three");
        myNavigable.put(9, "Nine");

        System.out.println(myNavigable.ceilingEntry(4));
        System.out.println(myNavigable.lowerKey(3));
        System.out.println(myNavigable.higherKey(6));

    }
}
