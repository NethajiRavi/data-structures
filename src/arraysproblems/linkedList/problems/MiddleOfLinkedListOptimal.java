package arraysproblems.linkedList.problems;

import arraysproblems.linkedList.single_linked_list.Node;
import arraysproblems.linkedList.single_linked_list.NodeUtils;

public class MiddleOfLinkedListOptimal {

    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 1};
        Node node = NodeUtils.convertArrayToLinkedList(arr);
//        Node nodes = NodeUtils.getMiddleOfLinkedList(node);
//        NodeUtils.transverse(nodes);


        Node nods = NodeUtils.reverseASingleLinkedList(node);
        NodeUtils.transverse(nods);

    }
}
