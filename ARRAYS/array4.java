//reversal of an array

import java.util.Scanner;

public class array4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n = sc.nextInt();
        int[] arr= new int[n];

        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
    

    

    int i=0;
    int j = n-1;

    while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
    }


    for(int k=0; k<n; k++){
            System.out.println(arr[k]);
    }
    
}

}
