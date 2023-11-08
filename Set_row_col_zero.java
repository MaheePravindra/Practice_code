import java.util.*;
public class Set_row_col_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count=0;
        int[][] arr = new int[size][size];
        int[][] a = new int[size][size];

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                a[i][j] = arr[i][j];
            }
        }

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arr[i][j]==0){
                    count=j;
                    break;
                }
            }
            System.out.println(count);
            if(count!=0){
                for(int j=0;j<size;j++){
                    a[i][j]=0;
                }
                for(int k=0; k<size; k++){
                    a[k][count]=0;
                }
            }
            count=0;
            

        }
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
