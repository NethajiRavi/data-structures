package arraysproblems.medium;

public class NumberAppearAtOnce {

    public static void main(String[] args) {

        int[] arr =  new int[]{2,2,1,1,4};
        int count =0;
        Integer value = null;

        for(int i =0;i< arr.length;i++){
            for(int j = i;j<arr.length;j++){
                if(arr[j] == arr[i]){
                    count++;

                }
            }

            if(count ==1){
                value = arr[i];
            }else {
                value =  null;
            }

        }

        System.out.println(value);
    }
}
