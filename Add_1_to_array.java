import java.util.*;
public class Add_1_to_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count=0;
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            if(arr[i]==9){
                count++;
            }
            
        }
        if(arr[size-1]<9){
            arr[size-1] +=1;
        }
        else if(count<size){
            //arr[size-1]=0;
            for(int i=size-2; i>0; i--){
                if(arr[i+1]>=9){
                    arr[i+1] = 0;
                    arr[i] += 1;
                }
            }
        }
        else if(count==size){
                int[] arr2 = new int[size+1];
                arr2[0] = 1;
                for(int i=1;i<size+1;i++){
                    arr2[i] = 0;
                }
                for(int i=0;i<size+1;i++){
                    System.out.print(arr2[i]+" ");
                }

        }
        if(count!=size){
            for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        }
        
    }
}
