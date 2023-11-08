import java.util.*;
public class Lower_Triangle_2d{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int[][] arr = new int[d][d];
        for(int i=0; i<d; i++){
            for(int j=0; j<d; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Lower Triangle: ");
        /*for(int k=0; k<d;k++){
            for(int i=0;i<d;i++){
                for(int j=0;j<d;j++){
                    if(i-j==k){
                        System.out.print(arr[i][j]+ " ");
                    }
                }
                
            }

        }    */
        for(int i=0; i<d; i++){
            for(int j=0; j<d-i;j++){
                System.out.print(arr[i+j][j]+" ");
            }
        }
        
        
    }
}