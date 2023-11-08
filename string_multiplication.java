import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class string_multiplication {
    public static void main(String[] args) {
        String inp = "a3b4c1";
        int k=0;
        Stack<Character> S= new Stack<Character>();
        for(int i=0; i<inp.length(); i++){
            if(inp.charAt(i)>='a'&&inp.charAt(i)<='z'){
                S.push(inp.charAt(i));
            }
            if(inp.charAt(i)>='1' && inp.charAt(i)<='9'){
                k = inp.charAt(i)-'0';
                for(int j=0;j<k-1;j++){
                     S.push(inp.charAt(i-1));   
                }
                while(!S.isEmpty()){
                    System.out.print(S.pop());
                }
            }
            


        }
        
    }
}

