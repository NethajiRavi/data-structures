package arraysproblems.linkedList.problems;

import arraysproblems.linkedList.single_linked_list.Node;
import arraysproblems.linkedList.single_linked_list.NodeUtils;

public class LinkedListNodalPoints {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 3, 4, 5, 6, 7, 1};
        Node node = NodeUtils.convertArrayToLinkedList(arr);
        // only by memory Address comparison
     //   Node value = NodeUtils.returnCyclicNodeBrute(node);

        Node value = NodeUtils.returnCyclicNodeOptimal(node);

    }
}
