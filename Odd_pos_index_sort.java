import java.util.*;
public class Odd_pos_index_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        if(size%2!=0){
            
            int[] b = new int[(size/2)+1];
            for(int i=0 ;i<size; i++){
                arr[i] = sc.nextInt();
            }
            int j=0;
            for(int i=0; i<size; i+=2){
                b[j++] = arr[i];
            }
            Arrays.sort(b);
            for(int i=0; i<(size/2)+1; i++){
                System.out.print(b[i]+" ");
            }
        }
        else{
            int[] b = new int[size/2];
            for(int i=0 ;i<size; i++){
                arr[i] = sc.nextInt();
            }
            int j=0;
            for(int i=0; i<size; i+=2){
                b[j++] = arr[i];
            }
            Arrays.sort(b);
            for(int i=0; i<size/2; i++){
                System.out.print(b[i]+" ");
            }
        }
        
    }
}
