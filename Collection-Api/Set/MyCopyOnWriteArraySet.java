package Set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class MyCopyOnWriteArraySet {
    public static void main(String[] args) {
        // IF we already have concurrentSkipListSet ? || why we need any another dataset for thread saftey
        // This will store data in a sorted manner
        // when we need to implement range based operations --> used skip list dataStructure
        // This is a weekly consistence
        ConcurrentSkipListSet<Integer> conSkipListSet = new ConcurrentSkipListSet<>();

        // MCOWAS
        // Threas-safe, Copy-On-Write-Mechanism
        // Iterate do not reflect modification, No duplicat elements
        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();

        for (int i = 1; i < 6; i++) {
            copyOnWriteSet.add(i);
            conSkipListSet.add(i);
        }

        System.out.println(copyOnWriteSet);
        System.out.println(conSkipListSet);

        
        for(Integer num : copyOnWriteSet){
            System.out.println(num);
            copyOnWriteSet.add(6);
        }
        System.out.println(copyOnWriteSet);

        
        for(Integer num : conSkipListSet){
            System.out.println(num);
            // conSkipListSet.add(6);
            if(num == 5) conSkipListSet.add(6);
        }
        System.out.println(conSkipListSet);
    }

}
