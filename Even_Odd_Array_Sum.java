import java.util.*;
public class Even_Odd_Array_Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int eve=0, odd=0;
        int[] a = new int[size];
        for(int i=0; i<size; i++){
            a[i] = s.nextInt();
        }
        for(int i=0; i<size; i++){
            if(a[i]%2==0){
                eve+=a[i];
            }
            else{
                odd+=a[i];
            }
        }
        System.out.println("Even sum: "+eve+" Odd sum: "+odd);
    }
    
}
