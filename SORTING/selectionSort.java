public class selectionSort{
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,-9};
        SelectionSort(arr);
    }

    public static void SelectionSort(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            int minval = arr[i];
            int minindx = i;

            for(int j= i+1;j<arr.length;j++){
                if(arr[j] < minval){
                    minval = arr[j];
                    minindx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minindx];
            arr[minindx] = temp;
        }

        for(int val: arr){
            System.out.println(val);
        }
    }
}