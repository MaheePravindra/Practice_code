import java.lang.*;
import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a*a;
        if((b-a)%10==0){
            System.out.println("It is an automorphic number");
        }
        else{
            System.out.println("It is not an automorphic number");
        }
    }
    
}
