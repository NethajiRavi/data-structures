package arraysproblems.linkedList.single_linked_list;

public class DeleteKthElement {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Node node = NodeUtils.convertArrayToLinkedList(arr);
        Node node1 = NodeUtils.deleteKthElement(node, 1);
        NodeUtils.transverse(node1);
    }
}
