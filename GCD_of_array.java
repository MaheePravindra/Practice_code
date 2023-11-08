import java.util.*;
public class GCD_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int gcd=0;
        int temp=1;
        for(int i=0; i<size-1; i++){
            while(temp>0){
                temp = arr[i+1]%arr[i];
                arr[i+1]=arr[i];
                if(temp!=0){
                    arr[i] = temp;
                }
            }
            arr[i+1] = arr[i];
            
        }
        System.out.println(arr[size-1]);
    }
}
