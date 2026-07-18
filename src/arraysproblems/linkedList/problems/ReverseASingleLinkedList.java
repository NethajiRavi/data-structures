package arraysproblems.linkedList.problems;

import arraysproblems.linkedList.single_linked_list.Node;
import arraysproblems.linkedList.single_linked_list.NodeUtils;

public class ReverseASingleLinkedList {

    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 3, 4, 5};
        Node node = NodeUtils.convertArrayToLinkedList(arr);
        Node reversed = NodeUtils.reverseASingleLinkedListByStack(node);
        NodeUtils.transverse(reversed);
    }
}
