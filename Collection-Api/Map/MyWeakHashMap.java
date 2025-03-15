package Map;

import java.util.Map;
import java.util.WeakHashMap;

public class MyWeakHashMap {
    public static void main(String[] args) {
        // In weak map references of keys are weak
        // On jvm Garbage collection all weak references are removed 
        Map<Object, String> weakMap = new WeakHashMap<>();
        Object key1 = new String("key1");
        Object key2 = new String("key2");

        weakMap.put(key1, "valu1");
        weakMap.put(key2, "valu2");

        System.out.println(weakMap);

        key1 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("After GC: " + weakMap);

    }

}
