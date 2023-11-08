import java.util.*;
import java.lang.*;
public class equalsumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit:");
        int n = sc.nextInt();
        int sum1=0,sum2=0;
        int arr1[];
        arr1 = new int[n];
        int arr2[];
        arr2 = new int[n];
        System.out.println("Enter element of array 1: ");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
            sum1 = sum1 +arr1[i];
        }
        System.out.println("Enter element of array 2: ");
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
            sum2 = sum2 + arr2[i];
        }
        if(sum1==sum2){
            System.out.println("They are the same array");
        }
        else{
            System.out.println("Different array");
        }
    }
}
