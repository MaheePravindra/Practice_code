import java.lang.*;
import java.util.*;
import java.math.*;

public class extractnum {
    public static void main(String[] args) {
        
        String s = "Hello 84,this 875@6821?";
        String s1="";
        int i=0;
        int n=0;
        int max=0;
        while(i<s.length()){
            while(s.charAt(i)>=48 && s.charAt(i)<=57){
                s1 = s1+s.charAt(i);
                i++;
            }
            max=Math.max(Integer.parseInt(s1),max);
            i++;
        }

    }
    
}
