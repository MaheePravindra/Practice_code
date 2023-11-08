import java.util.*;
public class Binary_search_recursion {
    static int Search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return Search(arr, target, s, m-1);
        }
        return Search(arr, target, m+1, e);

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 11, 24, 35, 81};
        int target = 35;
        int s = 0;
        int e = arr.length - 1;
        System.out.println(Search(arr, target, s, e));
        String str="ooseu";
        System.out.print(str.substring(0,5));

    }
}
