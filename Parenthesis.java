import java.lang.*;
import java.util.*;

public class Parenthesis {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        char[] charArray = new char[s.length()];
        for(int j=0;j<s.length();j++){
            charArray[j] = s.charAt(j);
        }   
        
        for (int i = 0; i < charArray.length; i++) {   
              
            char current = charArray[i];   
                 
            if (current == '{' || current == '[' || current == '(') {   
  
                stack.push(current);   
                continue;   
            }    
            if (stack.isEmpty()) {    
                return false;   
            }   
          
            char popChar;   
            switch (current) {   
                case ')':   
                popChar = (char) stack.pop();   
                if (popChar == '{' || popChar == '[')   
                    return false;   
                break;   
                case '}':   
                popChar = (char) stack.pop();   
                if (popChar == '(' || popChar == '[')   
                    return false;   
                break;   
                case ']':   
                popChar = (char) stack.pop();   
                if (popChar == '(' || popChar == '{')   
                    return false;   
                break;   
            }   
        }   
        return (stack.isEmpty());   
    }  
    

    public static void main(String[] args) {
        Parenthesis P = new Parenthesis();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(P.isValid(s));

    }
    
}
