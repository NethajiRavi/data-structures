package arraysproblems.linkedList.double_linked_list;

public class DoubleNode {

    private DoubleNode next;
    private DoubleNode prev;
    private int Data;

    public DoubleNode(DoubleNode next, DoubleNode prev, int data) {
        this.next = next;
        this.prev = prev;
        Data = data;
    }



    public DoubleNode(int data) {
        Data = data;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }
}
