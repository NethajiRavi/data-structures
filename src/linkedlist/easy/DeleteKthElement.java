package linkedlist.easy;

import linkedlist.Node;

import static linkedlist.easy.convertArrayToLinkedList.convertArrayToLinkedLists;
import static linkedlist.easy.convertArrayToLinkedList.transverseLinkedLIst;

public class DeleteKthElement {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,5,6};
        int k = 8;
        Node node =   convertArrayToLinkedLists(arr);
        Node value =  deletionOfKthElement(node,k);
        transverseLinkedLIst(value);


    }

    private static Node deletionOfKthElement(Node node, int k) {

        if(node == null){
            return null;
        }
        if(k ==1){
            return node.getNext();
        }

        Node temp = node;
        Node prev = null;
        int count =0;

        while (temp !=null){
            count++;
            if(count == k){
                prev.setNext(temp.getNext());
                break;
            }
            prev = temp;
            temp = temp.getNext();
        }
        return node;
    }
}
