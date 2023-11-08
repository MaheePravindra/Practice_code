import java.util.*;
public class one_d_to_two_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // odd elements -> nxn
        System.out.print("Enter size:");
        int size = sc.nextInt();
        int[] ar1 = new int[size];
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++){
            ar1[i] = sc.nextInt();
        }
        
        System.out.print("Enter no of col: ");
        int col = sc.nextInt();
        System.out.print("Enter no of row: ");
        int row = sc.nextInt();
        if(row*col==size){
            int[][] ar2 = new int[row][col];
            int k=0;
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    ar2[i][j] = ar1[k++];
                }
            } 
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    System.out.print(ar2[i][j]+" ");
                }
                System.out.println();
            }
        }
        else if(row*col>size){
            
            int[][] ar2 = new int[row][col];
            int k=0;
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    if(k<ar1.length){
                        ar2[i][j] = ar1[k++];
                    }
                    
                    if(k>ar1.length){
                        ar2[i][j]=0;
                    }
                }
            } 
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    System.out.print(ar2[i][j]+" ");
                }
                System.out.println();
            }
        
        }
        else{
            System.out.println("2D matrix not possible");
        }
    }
}
