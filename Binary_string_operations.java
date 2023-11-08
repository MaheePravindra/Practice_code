import java.util.*;
public class Binary_string_operations {
    public static int calVal(String s){
        int n1=0, n2=0, t=0;
        Stack<Integer> ss = new Stack<Integer>();
        for(int i=0; i<s.length()-1;i++){
            if(s.charAt(i)=='1'||s.charAt(i)=='0'){
                n1 = s.charAt(i)-'0';
                ss.push(n1);
            }
            if(s.charAt(i)=='A'){
                
                n2 = s.charAt(i+1)-'0';
                ss.push(ss.pop()&n2);
                i++;
            }
            if(s.charAt(i)=='B'){
                
                n2 = s.charAt(i+1)-'0';
                ss.push(ss.pop()|n2);
                i++;
            }
            if(s.charAt(i)=='C'){
                
                n2 = s.charAt(i+1)-'0';
                ss.push(ss.pop()^n2);
                i++;
            }
        }
        return ss.peek();
    }
    public static void main(String[] args) {
        String s = "1C0C1C1A0B1";
        if(s.length()%2!=0){
            System.out.println(calVal(s));
        }
    }
}
