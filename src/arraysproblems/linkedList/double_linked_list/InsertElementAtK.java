package arraysproblems.linkedList.double_linked_list;

public class InsertElementAtK {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        DoubleNode node = DoubleNodeUtils.convertArrayToDl(arr);
        DoubleNode inserted = DoubleNodeUtils.insertElementAtKNode(node, 100, 2);
        DoubleNodeUtils.transverseADoubleLL(inserted);


    }
}
