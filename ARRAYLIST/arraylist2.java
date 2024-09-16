//remove all even numbers from arraylist

import java.util.*;

public class arraylist2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();

        //add
        list.add(5);
        list.add(10);
        list.add(4);
        list.add(15);
        list.add(8);
        list.add(21);
        list.add(3);
        list.add(2);
        list.add(10);

        RemoveEven(list);
        System.out.println(list);
    }

    public static void RemoveEven(ArrayList<Integer>list){
        for(int i = list.size()-1; i>=0; i--){
            if(list.get(i)%2==0){
                list.remove(i);
            }
        }
        
    }
    
}
