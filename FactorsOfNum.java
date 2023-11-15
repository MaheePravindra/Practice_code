import java .util.*;
public class FactorsOfNum {
    public static void main(String[] args) {
        factors1(20);
        System.out.println();
        factors2(20);
        System.out.println();
        System.out.println(GCD(105,224));
        System.out.println(LCM(2,7));
    }
    static void factors1(int n){//Time : O(n)
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    static void factors2(int n){//Time : O(Sqrt(n))
        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(i==n/i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }

    static int GCD(int a, int b){//GCD is ths same as HCF
        if(a==0){
            return b;
        }
        // if a!=0 then a can be replaced by b%a and b can be replaced by a
        return GCD(b%a,a);
    }

    static int LCM(int a , int b){
        return a*b/GCD(a,b); //since a*b = lcm*hcf
    }

}
