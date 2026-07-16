package arraysproblems.linkedList.double_linked_list;

public class ReverseADoubleLinkedList {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        DoubleNode node = DoubleNodeUtils.convertArrayToDl(arr);
//        DoubleNode doubleNode = DoubleNodeUtils.reverseDoubleLinkedListStack(node);
//        DoubleNodeUtils.transverseADoubleLL(doubleNode);

        DoubleNode node1 = DoubleNodeUtils.reverseDoubleLinkedListOptimalSolution(node);
        DoubleNodeUtils.transverseADoubleLL(node1);


    }
}
