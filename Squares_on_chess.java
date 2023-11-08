import java.util.*;
public class Squares_on_chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt(),count=0;
        count = size*(size+1)*((2*size)+1)/6;
        /*for(int i=size;i>0;i--){
            count+=i*i;
        }*/
        System.out.println(count);
    }    
}

/* 1x1 = 8^2 = 64
   2x2 = 7^2 = 49
   3x3 = 6^2 = 36
   4x4 = 5^2 = 25
   5x5 = 4^2 = 16
   6x6 = 3^2 = 9
   7x7 = 2^2 = 4
   8x8 = 1^2 = 1
   ---------------
              204
 */