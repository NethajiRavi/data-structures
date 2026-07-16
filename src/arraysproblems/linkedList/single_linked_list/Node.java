package arraysproblems.linkedList.single_linked_list;

public class Node {

    private  Node next;
    private  int date;

    public Node(Node next, int date) {
        this.next = next;
        this.date = date;
    }

    public Node( int date) {
       this.date = date;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
