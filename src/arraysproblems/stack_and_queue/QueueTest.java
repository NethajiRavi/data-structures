package arraysproblems.stack_and_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<Integer> qu = new LinkedList<>();

        System.out.println(qu.add(1));
        System.out.println(qu.toString());
        System.out.println(qu.add(2));
        System.out.println(qu.toString());
        System.out.println(qu.add(3));
        System.out.println(qu.toString());
        System.out.println(qu.add(4));
        System.out.println(qu.toString());
        System.out.println(qu.poll());
        System.out.println(qu.toString());
        System.out.println(qu.peek());
        System.out.println(qu.toString());
        System.out.println(qu.poll());
        System.out.println(qu.toString());
        System.out.println(qu.peek());
        System.out.println(qu.toString());
        System.out.println(qu.add(5));
        System.out.println(qu.peek());
        System.out.println(qu.offer(6));
        System.out.println(qu.toString());
        System.out.println(qu.size());
    }
}
