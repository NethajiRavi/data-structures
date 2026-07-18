package arraysproblems.linkedList.single_linked_list;

import java.util.*;

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

    public static Node getMiddleOfLinkedList(Node node) {


        Node slow = node;
        Node fast = node;

        while (slow != null && fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

    public static Node reverseASingleLinkedList(Node node) {

        Node head = node;
        Node temp = head;
        Node prev = null;


        while (temp != null) {
            Node font = temp.getNext();
            temp.setNext(prev);
            prev = temp;
            temp = font;
        }

        return prev;

    }


    public static Node reverseASingleLinkedListByStack(Node node) {

        Node head = node;
        Stack<Integer> st = new Stack<>();
        Node temp = head;

        while (temp != null) {
            st.push(temp.getDate());
            temp = temp.getNext();
        }

        temp = head;

        while (temp != null) {
            temp.setDate(st.pop());
            temp = temp.getNext();
        }

        return head;

    }

    public static boolean isCyclicByBruteForce(Node node) {
        Map<Node, Integer> result = new HashMap<>();

        // it will works only the hascode values of the Node has to be same

        Node head = node;

        while (head != null) {
            if (result.containsKey(head)) {
                return true;
            } else {
                result.put(head, 1);
            }
            head = head.getNext();
        }
        return false;
    }


    public static boolean isCyclicByOptimalSolution(Node node) {
        Node slow = node;
        Node fast = node;
        // Need for Address Comparison
        while (fast != null && slow != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static Node returnCyclicNodeBrute(Node node) {
        Set<Node> set = new HashSet<>();
        Node head = node;
        while (head != null) {
            if (set.contains(head)) {
                return head;
            } else {
                set.add(head);
            }
            head = head.getNext();
        }
        return null;
    }

    public static Node returnCyclicNodeOptimal(Node node) {
        Node slow = node;
        Node fast = node;
        while (slow != null && fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                slow = node;
                while (slow != null && fast != null) {
                    slow = slow.getNext();
                    fast = fast.getNext();
                    if (slow == fast) {
                        return slow;
                    }
                }
                break;
            }
        }
        return null;
    }

    public static boolean isPalindromOrNotBrute(Node head) {

        Stack<Integer> st = new Stack<>();

        Node temp = head;

        while (temp != null) {
            st.push(temp.getDate());
            temp = temp.getNext();
        }

        temp = head;

        while (temp != null) {

            int date = temp.getDate();
            if (date != st.pop()) return false;
            temp = temp.getNext();
        }

        return true;


    }
}
