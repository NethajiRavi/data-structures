package arraysproblems.linkedList.double_linked_list;

public class ConvertArrayToDll {

    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        DoubleNode node = DoubleNodeUtils.convertArrayToDl(arr);
        DoubleNodeUtils.transverseADoubleLL(node);



    }
}
