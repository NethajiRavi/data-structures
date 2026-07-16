package arraysproblems.linkedList.single_linked_list;

public class DeleteHeadOfLinkedList {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        Node node = NodeUtils.convertArrayToLinkedList(arr);
        Node deletedNode = NodeUtils.deleteHeadOfLinkedList(node);
       // NodeUtils.transverse(deletedNode);

        Node deleted = NodeUtils.deleteTailOfLinkedList(node);
        NodeUtils.transverse(deleted);
    }
}
