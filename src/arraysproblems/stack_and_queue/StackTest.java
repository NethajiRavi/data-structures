package arraysproblems.stack_and_queue;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println(st.push(1));
        System.out.println(st.toString());
        System.out.println(st.push(2));
        System.out.println(st.toString());
        System.out.println(st.push(3));
        System.out.println(st.toString());
        System.out.println(st.push(4));
        System.out.println(st.toString());
        System.out.println(st.pop());
        System.out.println(st.toString());
        System.out.println(st.peek());
        System.out.println(st.toString());
        System.out.println(st.pop());
        System.out.println(st.toString());
        System.out.println(st.peek());
        System.out.println(st.toString());
        System.out.println(st.push(5));
        System.out.println(st.peek());
        System.out.println(st.toString());
        System.out.println(st.size());

    }
}
