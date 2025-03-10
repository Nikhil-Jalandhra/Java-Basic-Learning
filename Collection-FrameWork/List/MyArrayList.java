package List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {
        // how to declare arrayList
        ArrayList<Integer> list1 = new ArrayList<>(25); // we can define ini capacity also 
        list1.add(5); // random add
        list1.add(12); // random add
        list1.add(20); // random add
        list1.add(1, 6); // add with address
        list1.set(2, 30); // replace with address
        list1.trimToSize(); // size == capacity
        

        System.out.println(list1); // print full array
        list1.sort(null);;
        System.out.println(list1); // print Sorted Array array
        System.out.println(list1.get(0)); // print specific value
        System.out.println(list1.size()); // length of array

        List<String> list2 = Arrays.asList("Monday", "Tuesday"); // mutable, but not extend.
        String[] list3 = {"Wednesday", "Thrusday"}; // one more method to create arrayList

        List<String> list4 = List.of("Friday", "Saturday"); // Imutable 

        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
    }
}
