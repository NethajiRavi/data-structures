package arraysproblems.linkedList.single_linked_list;

public class DeleteElementByKValue {
    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Node node = NodeUtils.convertArrayToLinkedList(arr);
        Node DeletedByValues = NodeUtils.deleteElementByValue(node, 8);
        NodeUtils.transverse(DeletedByValues);
    }
}
