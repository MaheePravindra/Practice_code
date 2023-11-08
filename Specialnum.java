import java.lang.*;
import java.util.*;

public class Specialnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int temp=0;
        

        for(int i=start;i<end;i++){
            temp=i;
            int a=0, b=1;
            while(temp>0){
                 a += temp%10;
                 b *= temp%10;
                temp=temp/10;
            } 
            if(a+b==i){
                    System.out.println("It is a Special number"+i);
                }   
            
        }
    }
    
}
