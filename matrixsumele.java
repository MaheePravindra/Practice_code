import java.lang.*;
import java.util.*;
public class matrixsumele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddsum=0,evesum=0;
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
        for(int i=0;i<r1;i++){
            for(int j=0;j<r2;j++){
                if(arr1[r1][r2]%2==0){
                    evesum+=arr1[r1][r2];
                }
                else{
                    oddsum+=arr1[r1][r2];
                }
            }
        }
    }
}
