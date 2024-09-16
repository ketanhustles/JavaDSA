public class printIncreasing{
    public static void main(String[] args) {
        PrintIncreasing(7);
    }

    public static void PrintIncreasing(int N){
        if(N==0){
            return;
        }
        PrintIncreasing(N-1);
        System.out.println(N);
    }
}