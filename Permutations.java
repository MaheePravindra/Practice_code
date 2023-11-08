import java.util.*;
public class Permutations {
    public static void main(String[] args) {
        permutn("", "abc");
    }
    static void permutn(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0,i);
            String last = p.substring(i,p.length());
            permutn(first + ch + last, up.substring(1));
        }
    }
}
