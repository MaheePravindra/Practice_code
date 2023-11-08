import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        String s = "abcdbcdb";
        int i=0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                i++;
                j=s.length()-1;
            }
        }
        int index = j;
        System.out.println(index);
        System.out.print(s);
        for(int z=index-1;z>=0;z--){
            System.out.print(s.charAt(z));
        }
    }
}
