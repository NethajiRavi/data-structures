package arraysproblems.linkedList.problems;

import arraysproblems.linkedList.single_linked_list.Node;
import arraysproblems.linkedList.single_linked_list.NodeUtils;

public class OddOrEvenInLinkedList {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        Node node = NodeUtils.convertArrayToLinkedList(arr);
        Node head = node;
        Node odd = node;
        Node even = node.getNext();
        Node evenHead = node.getNext();
        while (even != null && even.getNext() != null) {
            odd.setNext(odd.getNext().getNext());
            even.setNext(even.getNext().getNext());
            even = even.getNext();
            odd = odd.getNext();
        }
        odd.setNext(evenHead);
        NodeUtils.transverse(head);
    }
}
