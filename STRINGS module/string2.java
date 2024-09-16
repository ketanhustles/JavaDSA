//reverse vowels in a string

public class string2 {
    public static void main(String[] args) {
        String st = "welcometoscaler";
        reverseVowels(st);

    }

    public static void reverseVowels(String st){
        char[] s = st.toCharArray();
        int i=0;
        int j=s.length-1;

        while(i<j){
            while(s[i] != 'a' && s[i] != 'e' && s[i] != 'i' && s[i] != 'o' && s[i] != 'u' ){
                i++;
            }

            while(s[j] != 'a' && s[j] != 'e' && s[j] != 'i' && s[j] != 'o' && s[j] != 'u' ){
                j--;
            }

            if(i>=j){
                break;
            }

            char ch= s[i];
            s[i]=s[j];
            s[j]=ch;

            i++;
            j--;
        }

        for(char ch: s){
            System.out.println(ch);
        }

    }
    
}
