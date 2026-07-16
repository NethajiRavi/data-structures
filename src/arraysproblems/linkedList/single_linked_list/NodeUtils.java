package arraysproblems.linkedList.single_linked_list;

public class NodeUtils {

    public static Node convertArrayToLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.setNext(temp);
            mover = temp;

        }
        return head;
    }

    public static Node deleteHeadOfLinkedList(Node node) {
        if (node == null) return node;
        return node.getNext();
    }

    public static void transverse(Node deletedNode) {

        Node head = deletedNode;

        while (head != null) {
            System.out.println(head.getDate());
            head = head.getNext();
        }


    }

    public static Node deleteTailOfLinkedList(Node node) {
        if (node == null) return node;
        Node head = node;
        Node temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();

        }
        temp.setNext(null);
        return head;
    }

    public static Node deleteKthElement(Node node, int k) {
        if (node == null) return node;
        Node head = node;
        if (k == 1) {
            return node.getNext();
        }
        int count = 0;
        Node prev = null;
        while (head != null) {
            count++;

            if (count == k) {
                Node next = head.getNext();
                prev.setNext(next);
            }
            prev = head;
            head = head.getNext();
        }
        return head;

    }

    public static Node deleteElementByValue(Node node, int k) {
        Node head = node;
        Node temp = head;
        if (temp == null) return head;
        if (temp.getDate() == k) {
            return temp.getNext();
        }

        Node prev = null;

        while (temp != null) {

            if (temp.getDate() == k) {
                Node NextValue = temp.getNext();
                prev.setNext(NextValue);
            }
            prev = temp;
            temp = temp.getNext();


        }
        return head;
    }

    public static Node insertAtKthElement(Node node, int ele, int k) {
        Node head = node;
        if (head == null) return head;

        if (k == 1) {
            Node newNode = new Node(ele);
            newNode.setNext(head);
            return newNode;
        }
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            if (count == k - 1) {
                Node next = new Node(temp.getNext(), ele);
                temp.setNext(next);
                break;
//              /  next.setNext(temp);
            }

            temp = temp.getNext();
        }
        return head;

    }
}
