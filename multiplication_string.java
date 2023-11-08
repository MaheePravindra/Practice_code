import java.util.*;
public class multiplication_string {
    public static void main(String[] args) {
        Stack<Character> ss = new Stack<Character>();
        String s = "aaabbbbccccf";
        int count =1;
        char c = (char)count;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                if(s.charAt(i)!=s.charAt(i+1)){
                    ss.push(s.charAt(i));
                    System.out.print(ss.pop());
                    System.out.print(count);   
                    count=1; 
                }

                
                else{
                    count++;
                }
            }    

        }
        System.out.print(s.charAt(s.length()-1));
        System.out.print(count);

        
    }
    
}
