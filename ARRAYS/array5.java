//print subarrays of array

import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n = sc.nextInt();
        int[] arr= new int[n];

        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

            
        }
        

        int si = 0;
        int ei = 0;

        for(si=0;si<n;si++){
            for(ei=si; ei<n; ei++){
                for(int k = si; k<=ei; k++){
                    System.out.print(arr[k]+ " ");

                }
                System.out.println();
                
            }
        }
    }
}
