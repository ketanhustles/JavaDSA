public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,-9};
        BubbleSort(arr);

    }

    public static void BubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j =0; j<arr.length-1-i;j++){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        for(int val:arr){
            System.out.println(val);
        }
    }
}
