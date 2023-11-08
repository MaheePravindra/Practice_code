import java.util.*;
import java.math.*;
public class Nearestprime {
    public static void main(String[] args) {
        int fact1 = 0;
        int fact2 = 0;
        int max =0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =num, k=num+1; i>0; i--,k++){

            for(int j=2; j<=i; j++){
                if(i%j==0){
                    fact1++;
                }
            for(int l=2;l<=k;k++){
                if(k%l==0){
                    fact2++;
                }
            }    
                
            if(fact2<2&&k>i){
                max=k;
                break;
            }
            else if(fact1<2&&k<i){
                max=i;
                break;
            }
            }
            if(fact1<2||fact2<2){
                System.out.println("Nearest prime: "+max);
                break;
            }
            fact1=0;        
            
        }
        
        
    }

    
}
