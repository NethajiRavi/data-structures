package arraysproblems.stack_and_queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementingStackUsingQueue {
    private Queue<Integer> qu = new LinkedList<>();

    public void push(int x) {
        int size = qu.size();
        qu.add(x);

        for (int i = 0; i < size; i++) {
            qu.add(qu.poll());
        }

    }

    public int pop() {
        return qu.poll();
    }

    public int top() {
        return qu.peek();
    }

    public boolean empty() {
        return qu.isEmpty();
    }

}
