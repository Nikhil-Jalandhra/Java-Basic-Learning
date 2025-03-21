package Map.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class MySortedMap {
    public static void main(String[] args) {
        // sorted array is a interface that implement tree
        // entries are sorted based on the keys, either in the natural order or based on comparator.
        // 
        SortedMap<Integer, String> loan = new TreeMap<>((a,b) -> b-a);
        loan.put(89, "Vivek");
        loan.put(95, "Sammer");
        loan.put(99, "Rahul");
        loan.put(75, "Anmol");

        System.out.println(loan);
        System.out.println(loan.firstKey());
        System.out.println(loan.lastKey());
        System.out.println(loan.headMap(95));
        System.out.println(loan.tailMap(95));
    }
}
