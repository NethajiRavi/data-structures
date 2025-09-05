package linkedlist.easy;

import linkedlist.Node;

import static linkedlist.easy.convertArrayToLinkedList.convertArrayToLinkedLists;
import static linkedlist.easy.convertArrayToLinkedList.transverseLinkedLIst;

public class DeleteTailOfLinkedList {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,5,6};
        Node node =   convertArrayToLinkedLists(arr);
        Node modified = deletionOfTail(node);
        transverseLinkedLIst(modified);

    }

    private static Node deletionOfTail(Node head) {

        if(head == null || head.getNext() ==null){
            return null;
        }

        Node temp = head;
        while (temp.getNext().getNext() != null){
            temp = temp.getNext();
        }

        temp.setNext(null);
        return head;

    }
}
