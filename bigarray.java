import java.util.*;
import java.lang.*;
public class bigarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit:");
        int n = sc.nextInt();
        int index=0;
        int arr1[];
        arr1 = new int[n];
        int arr2[];
        arr2 = new int[n];
        System.out.println("Enter element of array 1: ");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter element of array 2: ");
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr1[i]>arr2[i]){
                index++;
            }
        }
        if(index==n){
            System.out.println("Big array");
        }
        else{
            System.out.println("Normal array");
        }
        
    }
}