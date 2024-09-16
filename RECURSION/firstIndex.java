public class firstIndex {
    public static void main(String[] args) {
        int[] arr={2,3,6,9,8,3,2,6,2,4};
        int x=2;
        System.out.println(PrintArray(arr,x, 0));

    }

    public static int PrintArray(int[] arr, int x, int i){

        if( i ==arr.length){
            return -1;
        }
        if(arr[i]==x){
            return i;
        }
        else{
            int idx = PrintArray(arr,x,i+1);
            return idx;
        }
    }
}
