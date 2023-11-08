import java.lang.*;
import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int r1=sc.nextInt();
        System.out.println("Enter no. of cols:");
        int r2=sc.nextInt();
        int arr1[][] = new int[r1][r2];
        System.out.println("Enter element of Matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<r2;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<r2;j++){
                System.out.print(arr1[i][j]+" ");
            }
        System.out.println();
        }
        System.out.println("Transpose Matrix:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<r1;j++){
                System.out.print(arr1[j][i]+" ");
            }
        System.out.println();
        }
    }
}
