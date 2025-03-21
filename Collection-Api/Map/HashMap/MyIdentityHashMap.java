package Map.HashMap;

import java.util.IdentityHashMap;
import java.util.Map;

public class MyIdentityHashMap {
    public static void main(String[] args) {
        // In map all game work on Hashcode or equals method
        // Identity HashMap is work on based on object hashcode
        // Identity Hashcode or == operator -> no use of .equals method
        String key1 = new String("Key");
        String key2 = new String("Key");

        System.out.println(System.identityHashCode(key1)); // Story of identity hashmap >——————↴
        System.out.println(System.identityHashCode(key2)); // ←———————————————————————————————↙
        System.out.println(key1.hashCode()); // Story of hashmap >——————↴
        System.out.println(key2.hashCode()); // ←——————————————————————↙

        // Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new IdentityHashMap<>();

        map.put(key1, 1);
        map.put(key2, 2);

        System.out.println(map);

    }
}
