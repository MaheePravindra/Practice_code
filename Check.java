import java.lang.*;
import java.util.*;
class Check{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int as = c;
        if(90>=as && as>=65){
            if(c=='A'||c=='E'||c=='E'||c=='O'||c=='U'){
                System.out.println("It is a vowel");
            }
            else{
                System.out.println("It is a consonent");
            }
        }    
        
    }
}