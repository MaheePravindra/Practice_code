import java.util.*;
import java.lang.*;

public class move_0_left {
    public static void main(String[] args) {
        int a[] = {1,1,0,1,0,0,1,0};
        int n=a.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(a[left]==0){
                left++;
            }
            else if(a[right]==1){
                right--;
            }
            else{
                a[left]=0;
                a[right]=1;
                left++;
                right--;
            }
        
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }
    
}
