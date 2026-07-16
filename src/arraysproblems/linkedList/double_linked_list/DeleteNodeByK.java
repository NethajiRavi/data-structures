package arraysproblems.linkedList.double_linked_list;

public class DeleteNodeByK {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        DoubleNode node = DoubleNodeUtils.convertArrayToDl(arr);
        DoubleNode deleted = DoubleNodeUtils.deleteDoubleLLByKPosition(node,5);
        DoubleNodeUtils.transverseADoubleLL(deleted);

    }
}
