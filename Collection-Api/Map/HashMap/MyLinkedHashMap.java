package Map.HashMap;

import java.util.LinkedHashMap;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        // comparision to hashMap linked will be slow / order (Insertion Order) / no sorting

        LinkedHashMap<Integer, String> fruits = new LinkedHashMap<>(11,2.8f, false); //double linkList
        fruits.put(1, "Apple");
        fruits.put(2, "Banana");

        System.err.println(fruits.getOrDefault(1, "santra"));
        System.err.println(fruits.putIfAbsent(3, "Avacado"));

        System.out.println(fruits);
    }
}
