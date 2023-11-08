import java.util.*;
public class Bitwise {
    public static void main(String[] args) {
        int n = 21;
        System.out.println(OddEve(n));

        //unique element in an array
        int[] arr = {2, 3, 4, 5, 2, 5, 3};
        System.out.println(ANS(arr));

        //unique element in an array
        int[] arrr = {3, 3, 2, 1, 2, 2, 1, 3, 5, 1, 5, 5, 4};
        System.out.println(SUM2(arrr));
    }
    public static boolean OddEve(int n){
        return (n&1) == 1;
    }

    public static int ANS(int[] arr){
        int unique = 0;

        /* same as:
         * for(int i=0; i<arr.length; i++){
         *      unique^=arr[i];
         * }
         */
        for(int i : arr){
            unique ^= i;
        }
        /*since XOR of any number X
        * X^1 = ~X
        * X^0 = X
        * X^X = 0;
        */
        return unique;
    }

    public static int SUM2(int[] arrr){
        int unique = 0;
        int ans = 0;
        Arrays.sort(arrr);
        for(int i: arrr){
            unique^=i;
            ans^=unique;
        }
        return unique;
    }
}
