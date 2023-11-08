import java.util.*;
public class Col_wise_sum_2dmat {
    public static int[][] input(int[][] arr,int row, int col){
        
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<row;i++){
            for(int j=0; j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void Sum(int[][] arr, int row, int col){
        int sum = 0;
        for(int i=0; i<col;i++){
            sum=0;
            for(int j=0; j<row; j++){
                sum+=arr[j][i];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        input(arr,row,col);
        Sum(arr,row,col);
    }
}
