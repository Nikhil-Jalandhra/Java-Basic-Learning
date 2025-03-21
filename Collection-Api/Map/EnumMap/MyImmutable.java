package Map.EnumMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MyImmutable {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Alfredo", 99);
        map1.put("Foog", 95);
        
        // One method to make it unmuttable is Collection.

        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        map2.get("Foog");
        // map2.put("Bindass", 55); not possible 

        // But we want parent should be unmuttable  
        // There for we have clean method

        Map<String, Integer> map3 = Map.of("Bindass", 138, "PocketFoog", 75);
        
        // It ensure that it will be unmuttable
        // map3.put("FastTrack", 3000);
        
        // Map.of have only 10 seats avilable
        
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Bindass", 138), Map.entry("PocketFoog", 75));
        // Map.ofEntries have only Unlimited seats avilable

    }
}
