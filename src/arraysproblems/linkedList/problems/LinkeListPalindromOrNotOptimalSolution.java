package arraysproblems.linkedList.problems;

import arraysproblems.linkedList.single_linked_list.Node;
import arraysproblems.linkedList.single_linked_list.NodeUtils;

public class LinkeListPalindromOrNotOptimalSolution {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 2, 1};
        Node node = NodeUtils.convertArrayToLinkedList(arr);
        Node head = node;

        Node slow = node;
        Node fast = node;

        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        Node newHead = rotateLinkedList(slow.getNext());
        Node first = head;
        Node second = newHead;

        while (second != null) {
            if (second.getDate() != first.getDate()) {
                System.out.println(false);
                break;
            }
            first = first.getNext();
            second = second.getNext();

        }
        Node original = rotateLinkedList(newHead);
        NodeUtils.transverse(head);

    }

    private static Node rotateLinkedList(Node next) {

        Node temp = next;
        Node prev = null;

        while (temp != null) {
            Node forword = temp.getNext();
            temp.setNext(prev);
            prev = temp;
            temp = forword;

        }

        return prev;
    }


}
