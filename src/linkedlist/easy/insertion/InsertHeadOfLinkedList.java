package linkedlist.easy.insertion;

import linkedlist.Node;

import static linkedlist.easy.convertArrayToLinkedList.convertArrayToLinkedLists;
import static linkedlist.easy.convertArrayToLinkedList.transverseLinkedLIst;

public class InsertHeadOfLinkedList {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,6};
        Node LinkedList = convertArrayToLinkedLists(arr);
        Node node =   insertHead(LinkedList,14);
        transverseLinkedLIst(node);
    }

    private static Node insertHead(Node linkedList,int val) {
        return new Node(val,linkedList);
    }
}