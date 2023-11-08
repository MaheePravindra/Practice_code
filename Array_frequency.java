import java.util.*;
public class Array_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length1= sc.nextInt();
        int[] a = new int[length1];
        int[] b =new int[length1];
        int x = length1/2;
        for(int i=0; i<length1;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<length1; i++){
            int count=0;
            for(int j=0; j<length1; j++){
                if(a[i]==a[j]){         
                    count++;
                }
            }
            if(count>x){
                System.out.println(count);
                b[i] = count;
            }
            count=0;
        }
        for(int i=0;i<x;i++){
            if(b[i]>x){
                System.out.println(b[i]);
            }
        }
    }
}
