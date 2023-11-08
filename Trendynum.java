import java.lang.*;
import java.util.*;
class Trendynum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int num2;
        if(num>99&&num<1000){
            num2 = (num/10)%10;
            if(num2%3==0)
            {
                System.out.println("It is a trendy number");
            }
            else{
                System.out.println("It is not a trendy num");
            }
        }
        else{
            System.out.println("Normal number");
        }
    }
    
};