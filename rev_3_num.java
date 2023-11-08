import java.util.*;
import java.lang.*;
public class rev_3_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = (a%10)*100 + ((a/10)%10)*10 + a/100;
        System.out.println(num);
    }
    
}
