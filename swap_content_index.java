import java.util.*;
public class swap_content_index {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int s = sc.nextInt();
        int[] a = new int[s];
        int[] b = new int[s];
        int temp=0;
        for(int i=0; i<s; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0 ;i<s; i++){
            b[a[i]] =i;
        }
        for(int i=0; i<s;i++){
            System.out.print(b[i]+" ");
        }
    }
}
