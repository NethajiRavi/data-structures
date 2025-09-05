package linkedlist.easy;

import linkedlist.Node;

import static linkedlist.easy.convertArrayToLinkedList.convertArrayToLinkedLists;
import static linkedlist.easy.convertArrayToLinkedList.transverseLinkedLIst;

public class DeletionHeadOfLinkedList {

    public static void main(String[] args) {


        int[] arr = new int[]{1,2,3,5,6};
        Node node =   convertArrayToLinkedLists(arr);
        Node node1 = deletionOfHead(node);
        transverseLinkedLIst(node1);
    }

    private static Node deletionOfHead(Node node) {
        if(node == null) {
            return node;
        }
        return node.getNext();

    }
}
