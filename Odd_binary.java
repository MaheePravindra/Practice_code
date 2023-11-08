import java.util.*;
public class Odd_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            for(int i=0;i<=n;i+=2){
                System.out.println(Integer.toBinaryString(i));
            }
        }
        else{
            for(int i=1; i<=n; i+=2){
                System.out.println(Integer.toBinaryString(i));
            }

        }
    }
}
