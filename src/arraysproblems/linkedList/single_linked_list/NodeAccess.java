package arraysproblems.linkedList.single_linked_list;

public class NodeAccess {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        Node node = new Node(arr[0]);
    //    System.out.println(node.getDate());

       Node node1 =  convertArrayToLL(arr);
       Node newHead = node1;
       while (newHead!=null){
           System.out.println(newHead.getDate());
           newHead = newHead.getNext();

       }
    }

    private static Node convertArrayToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node Mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            Mover.setNext(temp);
            Mover = temp;
        }
        return head;


    }
}
