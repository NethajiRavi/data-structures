package linkedlist.easy.insertion;

import linkedlist.Node;

import static linkedlist.easy.convertArrayToLinkedList.convertArrayToLinkedLists;
import static linkedlist.easy.convertArrayToLinkedList.transverseLinkedLIst;

public class InsertBeforeTheValue {

    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 3, 5, 6};
        Node LinkedList = convertArrayToLinkedLists(arr);
        int element  = 31;
        int kthPosition = 6;
        Node LL =  insertBeforeValue(LinkedList,element,kthPosition);
        transverseLinkedLIst(LL);


    }

    private static Node insertBeforeValue(Node head, int element, int beforeElement) {
        if(head == null){
            return  null;
        }
        if(head.getData() == beforeElement){
            return new Node(element,head);
        }
        Node temp = head;
        while (temp.getNext() != null){

            if(temp.getNext().getData() == beforeElement){
                Node newNode =  new Node(element,temp.getNext());
                temp.setNext(newNode);
                break;

            }
            temp = temp.getNext();
        }
        return head;
    }
}
