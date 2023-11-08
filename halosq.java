import java.lang.*;
import java.util.*;
class halosq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter dimensions: ");
        int len=sc.nextInt();
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if((i==0)||(j==0)||(i==len-1)||j==len-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
    
}