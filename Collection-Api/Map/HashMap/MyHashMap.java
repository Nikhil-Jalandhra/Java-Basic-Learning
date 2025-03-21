package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> sub = new HashMap<>();
        // Key should be uniqe / value can be same / no order guaranteed / no sorting
        // Hash Code generation
        // collision
        // before java 8 use linkList |  after Red-Black-Tree || balanced Tree
        sub.put(1, "binod");
        sub.put(2, "parmod");
        sub.put(3, "vinod");
        sub.put(4, "Ujir");
        sub.put(5, "Bimal");
        sub.put(6, "Pali");

        System.out.println(sub);
        System.out.println(sub.get(1));
        System.out.println(sub.containsValue("binod"));

        for(int ab : sub.keySet()){ // first method to loop on map
            System.out.print(ab + "=" + sub.get(ab) + ", ");
        }
        System.out.println("");

        Set<Map.Entry<Integer, String>> entry = sub.entrySet();

        for(Map.Entry<Integer, String> ent : entry ){
            System.out.print(ent.getKey() +"="+ ent.getValue() + ", ");
        }

    }
}
