package arraysproblems.linkedList.double_linked_list;

public class DeleteHeadOfDoubleLL {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        DoubleNode node = DoubleNodeUtils.convertArrayToDl(arr);
        DoubleNode deletedNode = DoubleNodeUtils.deleteHeadOfDoubleLL(node);
        DoubleNodeUtils.transverseADoubleLL(deletedNode);


    }
}
