import java.util.*;
public class Even_Odd_Array_Sum_Part_2 {
    public static int AdditionArr(int[] arr){
            int size = arr.length;
            if(size%2==0){
                int[] eve = new int[size/2];
                int[] odd = new int[size/2];
                for(int i=0,j=0; i<size; i+=2){
                    eve[j++]=arr[i];
                }
                for(int i=1,j=0; i<size; i+=2){
                    odd[j++]=arr[i];
                }
                Arrays.sort(eve);
                Arrays.sort(odd);
                return eve[(size/2)-2]+odd[(size/2)-2];

            }
            else{
                int[] eve = new int[(size/2)+1];
                int[] odd = new int[(size/2)+1];
                for(int i=0,j=0; i<size; i+=2){
                    eve[j++]=arr[i];
                }
                for(int i=1,j=0; i<size; i+=2){
                    odd[j++]=arr[i];
                }
                Arrays.sort(eve);
                Arrays.sort(odd);
                return eve[(size/2)+1-2]+odd[(size/2)+1-2];
            }
            
        }
    public static void main(String[] args) {
        Even_Odd_Array_Sum_Part_2 E = new Even_Odd_Array_Sum_Part_2();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        if(size>=4){
            System.out.println(AdditionArr(arr));
        }
        
        
    }
}
