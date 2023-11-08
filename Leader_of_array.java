import java.util.*;
public class Leader_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] n = new int[size];
        for(int i=0; i<size; i++){
            n[i] = sc.nextInt();
        }
        int max=0;
        for(int i=size-1; i>0; i--){
            if(n[i]>max){
                max = n[i];
                System.out.print(max+" ");
            }
        }
    }
}
