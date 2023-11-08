import java.lang.*;
import java.util.*;
class revnum{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp2=0;
        for(int i = num; i>0;i=i/10){
            temp2 = temp2*10;
            temp2 = + (i%10);
        }
    }
}