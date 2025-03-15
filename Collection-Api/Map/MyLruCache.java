package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLruCache<k,v> extends LinkedHashMap<k,v> {
    // LRU(Least Recently Used)
    int capacity;

    public MyLruCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<k,v> eldest){
        return size()> capacity;
    };

    public static void main(String[] args) {
        MyLruCache<String, Integer> studentMap = new MyLruCache<>(3);
        studentMap.put("Michale", 98);// Removed when put called >——————↴
        studentMap.put("Hennry", 47);//                                 ⇂
        studentMap.put("Kevin", 95);//                                 ⇂
        studentMap.put("Margret", 66);// ←———————————————————————————↙

        System.out.println(studentMap);
    }
}
