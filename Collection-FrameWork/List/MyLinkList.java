package List;
import java.util.Arrays;
import java.util.LinkedList;

public class MyLinkList {
    public static void main(String[] args) {
        LinkedList<Integer> rollNumber = new LinkedList<>();
        rollNumber.add(9);
        rollNumber.add(3);
        rollNumber.add(6);
        rollNumber.removeLast(); 
        rollNumber.addFirst(10); 
        rollNumber.addLast(12); 
        rollNumber.removeIf(i -> i %2 ==0);

        LinkedList<String> fruits = new LinkedList<>(Arrays.asList("Apple", "Banana", "Gavava"));



        System.out.println(rollNumber);
        System.out.println(fruits);
    }
}
