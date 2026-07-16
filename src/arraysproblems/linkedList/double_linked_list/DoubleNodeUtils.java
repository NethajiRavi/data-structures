package arraysproblems.linkedList.double_linked_list;

import java.util.Stack;

public class DoubleNodeUtils {

    public static DoubleNode convertArrayToDl(int[] arr) {
        DoubleNode head = new DoubleNode(arr[0]);

        DoubleNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            DoubleNode node = new DoubleNode(null, temp, arr[i]);
            node.setPrev(temp);
            temp.setNext(node);
            temp = node;
        }

        return head;
    }

    public static void transverseADoubleLL(DoubleNode node) {

        DoubleNode temp = node;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public static DoubleNode deleteHeadOfDoubleLL(DoubleNode doubleNode) {
        DoubleNode head = doubleNode.getNext();
        head.setPrev(null);
        return head;
    }

    public static DoubleNode deleteTailOfDoubleLL(DoubleNode doubleNode) {
        DoubleNode node = doubleNode;
        DoubleNode temp = node;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(null);

        return node;
    }

    public static DoubleNode deleteDoubleLLByKPosition(DoubleNode doubleNode, int k) {

        DoubleNode head = doubleNode;
        if (head == null) return head;

        if (k == 1) {
            head = head.getNext();
            head.setPrev(null);
            return head;
        }
        DoubleNode temp = head;
        DoubleNode prev = null;
        int count = 0;
        while (temp != null) {

            count++;
            if (count == k) {
                DoubleNode next = temp.getNext();
                if (next != null) {
                    next.setPrev(prev);
                }
                prev.setNext(next);
            }
            prev = temp;
            temp = temp.getNext();
        }

        return head;

    }

    public static DoubleNode insertElementAtKNode(DoubleNode doubleNode, int ele, int k) {

        DoubleNode head = doubleNode;
        if (head == null) return head;

        if (k == 1) {
            DoubleNode newNode = new DoubleNode(head, null, ele);
            return newNode;
        }

        DoubleNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k - 1) {
                DoubleNode node = new DoubleNode(temp, temp.getPrev(), ele);
                temp.setNext(node);

                break;
            }

            temp = temp.getNext();
        }
        return head;

    }

    public static DoubleNode reverseDoubleLinkedListStack(DoubleNode node) {
        DoubleNode head = node;
        DoubleNode temp = head;

        Stack<Integer> st = new Stack<>();
        while (temp != null) {
            st.push(temp.getData());
            temp = temp.getNext();
        }

        temp = head;

        while (temp != null) {
            temp.setData(st.pop());
            temp = temp.getNext();
        }

        return head;
    }

    public static DoubleNode reverseDoubleLinkedListOptimalSolution(DoubleNode doubleNode) {
        DoubleNode head = doubleNode;
        DoubleNode current = head;
        DoubleNode prev = null;

        while (current != null) {
            DoubleNode temp = current.getNext();
            current.setNext(current.getPrev());
            current.setPrev(temp);
            prev = current;
            current = temp;
        }
        return prev;
    }
}
