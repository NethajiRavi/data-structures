package arraysproblems.linkedList.problems;

import arraysproblems.linkedList.single_linked_list.Node;
import arraysproblems.linkedList.single_linked_list.NodeUtils;

public class RemoveNthNodeOptimal {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int k = 2;
        Node node = NodeUtils.convertArrayToLinkedList(arr);
        Node del = lastDeleteOptimal(node, k);
        NodeUtils.transverse(del);


    }

    private static Node lastDeleteOptimal(Node node, int k) {
        Node head = node;
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            fast = fast.getNext();
        }

        while (fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext();
        }

        slow.setNext(slow.getNext().getNext());
        return head;
    }
}
