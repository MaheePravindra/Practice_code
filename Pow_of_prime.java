import java.lang.*;
import java.util.*;
public class Pow_of_prime{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        int p =s.nextInt();
        while(n>0){
            count += n/p;
            n=n/p;
        }
        System.out.println(count);
    }
}