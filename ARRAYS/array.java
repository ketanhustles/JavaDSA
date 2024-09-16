

 public class array{

    public static void main(String[] args) {
        int[] arr={5,7,10,1,25};

        //get
        System.out.println(arr[2]);

        //set
        arr[2]= 3;
        System.out.println(arr[2]);

        //length
        System.out.println(arr.length);

        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
 }