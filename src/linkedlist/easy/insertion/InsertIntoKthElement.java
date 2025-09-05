package linkedlist.easy.insertion;

import linkedlist.Node;

import static linkedlist.easy.convertArrayToLinkedList.convertArrayToLinkedLists;
import static linkedlist.easy.convertArrayToLinkedList.transverseLinkedLIst;

public class InsertIntoKthElement {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 5, 6};
        Node LinkedList = convertArrayToLinkedLists(arr);
        int element  = 31;
        int kthPosition = 6;

        Node KthElement = insertKthElementsOfLL(LinkedList, element, kthPosition);
        transverseLinkedLIst(KthElement);


    }

    private static Node insertKthElementsOfLL(Node linkedList, int element, int k) {
        if (linkedList == null) {
            if (k == 1) {
                return new Node(element);
            }
        }

        if (k == 1) {
            return new Node(element, linkedList);
        }

        int count = 0;
        Node temp = linkedList;
        while (temp != null) {
            count++;
            if (count == k - 1) {
                Node newNode = new Node(element, temp.getNext());
                temp.setNext(newNode);
                break;
            }
            temp = temp.getNext();
        }

        return linkedList;

    }
}
