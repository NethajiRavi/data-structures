package linkedlist.easy.insertion;

import linkedlist.Node;

import static linkedlist.easy.convertArrayToLinkedList.convertArrayToLinkedLists;
import static linkedlist.easy.convertArrayToLinkedList.transverseLinkedLIst;

public class InsertAtLast {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,6};
        Node LinkedList = convertArrayToLinkedLists(arr);
        Node l = insertLastOfLinkedLIst(LinkedList,1000);
        transverseLinkedLIst(l);
    }

    private static Node insertLastOfLinkedLIst(Node linkedList,int value) {

        if(linkedList == null) {
            return new Node(value);
        }
        Node temp = linkedList;
        while (temp.getNext() !=null){
            temp = temp.getNext();
        }
        Node tail =  new Node(value);
        temp.setNext(tail);
        return linkedList;
    }


}
