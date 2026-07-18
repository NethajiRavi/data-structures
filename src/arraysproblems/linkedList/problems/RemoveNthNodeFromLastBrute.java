package arraysproblems.linkedList.problems;

import arraysproblems.linkedList.single_linked_list.Node;
import arraysproblems.linkedList.single_linked_list.NodeUtils;

public class RemoveNthNodeFromLastBrute {

    public static void main(String[] args) {

        int[] arr = new int[]{1};
        int k = 1;
        Node node = NodeUtils.convertArrayToLinkedList(arr);
        Node deleted  = deleteNthNodeLast(node, k);
        NodeUtils.transverse(deleted);

    }

    private static Node deleteNthNodeLast(Node node, int k) {
        Node head = node;
        Node temp = node;

        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        int res = count - k;
        temp = head;

        if (res == 0) {
            return head.getNext();
        }
        while (temp != null) {
            res--;
            if (res == 0) {
                temp.setNext(temp.getNext().getNext());
                break;
            }
            temp = temp.getNext();
        }
        return head;
    }
}
