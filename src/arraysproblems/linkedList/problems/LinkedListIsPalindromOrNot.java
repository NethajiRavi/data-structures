package arraysproblems.linkedList.problems;

import arraysproblems.linkedList.single_linked_list.Node;
import arraysproblems.linkedList.single_linked_list.NodeUtils;

public class LinkedListIsPalindromOrNot {

    public static void main(String[] args) {

        int[] arr = new int[]{3,7,5,7,3};
        Node head = NodeUtils.convertArrayToLinkedList(arr);
        System.out.println(NodeUtils.isPalindromOrNotBrute(head));
    }
}
