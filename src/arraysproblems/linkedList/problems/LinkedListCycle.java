package arraysproblems.linkedList.problems;

import arraysproblems.linkedList.single_linked_list.Node;
import arraysproblems.linkedList.single_linked_list.NodeUtils;

public class LinkedListCycle {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6,1};
        Node node = NodeUtils.convertArrayToLinkedList(arr);

       // System.out.println(NodeUtils.isCyclicByBruteForce(node));
        System.out.println(NodeUtils.isCyclicByOptimalSolution(node));


    }
}
