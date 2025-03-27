package List;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        // LIFO behaviour (Last in first out)
        // Extended class of vector
        Stack<Integer> cookie = new Stack<>();
        cookie.push(2);
        cookie.add(3);
        cookie.add(8);
        cookie.pop(); // removing element
        int top = cookie.peek(); // seeking top element

        System.out.println(cookie);
        System.out.println(top);
    }    
}
