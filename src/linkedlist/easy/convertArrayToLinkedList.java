package linkedlist.easy;

import linkedlist.Node;

public class convertArrayToLinkedList {

    public static void main(String[] args) {
        int[] arr =  new int[]{1,2,3,1,5,6,1};
        Node list = convertArrayToLinkedLists(arr);
        transverseLinkedLIst(list);
    }

    public static void transverseLinkedLIst(Node list) {
        Node temp =list;
        while (temp !=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public static Node convertArrayToLinkedLists(int[] arr) {

        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i =1;i<arr.length;i++){
            Node next = new Node(arr[i]);
            temp.setNext(next);
            temp = next;
        }
    return head;
    }
}
