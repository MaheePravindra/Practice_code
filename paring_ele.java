import java.lang.*;
import java.util.*;
public class paring_ele {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int left=0;
        int right=size-1;
        if(size%2==0){
            while(left<size/2){
                System.out.println(arr[left]+" "+arr[right]);
                left++;
                right--;
            }
        }
        else{    
            while(left<size/2){
                System.out.println(arr[left]+" "+arr[right]);
                left++;
                right--;
            }
            System.out.println(arr[left]+" 0");
        }    
    }
       
    
}
