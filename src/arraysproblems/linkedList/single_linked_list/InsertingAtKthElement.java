package arraysproblems.linkedList.single_linked_list;

public class InsertingAtKthElement {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Node node = NodeUtils.convertArrayToLinkedList(arr);
        Node insertedNode = NodeUtils.insertAtKthElement(node, 5121, 2);
        NodeUtils.transverse(insertedNode);

    }
}
