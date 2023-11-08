import java.lang.*;
import java.util.*;
public class zigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimension:");
        int r1=sc.nextInt();
        int sum=0;
        int arr2[][] = new int[r1][r1];
        int arr1[][] = new int[r1][r1];
        System.out.println("Enter element of Matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<r1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<r1;j++){
                System.out.print(arr1[i][j]+" ");
            }
        System.out.println();
        }
        System.out.println("Sum:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<r1;j++){
                arr2[i][j]=arr1[j][i];
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<r1;j++){
                if(i==0||i==r1-1||i==j){
                    sum+=arr2[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    
}
