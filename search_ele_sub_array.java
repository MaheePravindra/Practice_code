import java.util.*;

public class search_ele_sub_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SIze: ");
        int n = sc.nextInt();
        int a=0, count=0;;
        int[] arr = new int[n];
        System.out.print("Enter subsize: ");
        int subsize = sc.nextInt();
        System.out.print("Enter element:");
        int ele = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n/subsize;i++){
            for(int j=i*subsize; j<subsize*(i+1);j++){
                if(arr[j]==ele){
                    count++;
                    break;
                }
            }
        }
        if(count==n/subsize){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
    
}
