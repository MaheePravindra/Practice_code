import java.util.*;
public class Sum_parlindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n, k=0;
        while(temp>0){
            k += temp%10;
            temp=temp/10;
        }
        System.out.println(k);
        temp=k;
        int k2=k;
        k=0;
        int i=0;
        while(temp>0){
            if(temp<10){
                k+=temp;
                break;
            }
            k += (temp%10)*10;
            temp=temp/10;           
        }
        System.out.println(k);
        if(k2==k){
            System.out.println("It is a palindrome");

        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
