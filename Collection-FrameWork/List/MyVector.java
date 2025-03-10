package List;
import java.util.Arrays;
import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        Vector<Integer> batch = new Vector<>(5,2);
        batch.add(2);
        batch.add(4);
        batch.add(8);
        batch.add(7);
        batch.add(6);
        batch.add(1); // capacity increase by two

        System.out.println(batch);
        batch.clear();
        batch.trimToSize();
        System.out.println(batch.capacity()); //direct capacity access
        
        Vector<Integer> onTheFly = new Vector<>(Arrays.asList(1,2,3,4));
        System.out.println(onTheFly);
    }
}
