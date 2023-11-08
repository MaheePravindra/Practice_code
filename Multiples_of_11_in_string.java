import java.util.*;
public class Multiples_of_11_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int num = sc.nextInt();
        for(int i=num; i>0; i=i/10){
            int temp=0;
            for(int j=i;j>0;j=j/10){
                temp*=10;
                temp+=j%10;
                if(temp%11==0){
                    count++;
                }
            }
        }
        System.out.println(count);
       
    }
}
