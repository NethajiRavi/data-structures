package arraysproblems.linkedList.double_linked_list;

public class DeleteTailOfDoubleLL {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        DoubleNode doubleNode = DoubleNodeUtils.convertArrayToDl(arr);
        DoubleNode tailDeleted = DoubleNodeUtils.deleteTailOfDoubleLL(doubleNode);
        DoubleNodeUtils.transverseADoubleLL(tailDeleted);

    }
}
