import java.util.*;
public class M1s_in_2d_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0, r=0;
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            int count=0;
            for(int j=0; j<col; j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(max<=count){
                max=count;
                r=i;
            }
        }
        System.out.println(r+1);

    }
}
