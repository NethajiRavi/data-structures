package arraysproblems.linkedList.problems;

import arraysproblems.linkedList.single_linked_list.Node;
import arraysproblems.linkedList.single_linked_list.NodeUtils;

public class MiddleOfTheLinkedListBruteForce {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5,6};
        Node node = NodeUtils.convertArrayToLinkedList(arr);
        Node head = node;
        Node temp = head;

        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }

        int middle = count / 2 + 1;
        temp = head;
        int ano = 0;
        while (temp != null) {
            ano++;
            if (ano == middle) {
                break;
            }
            temp = temp.getNext();
        }
        NodeUtils.transverse(temp);


    }
}
