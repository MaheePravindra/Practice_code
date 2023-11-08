import java.util.*;
public class array_ascending_descending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int [size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        if(size%2 == 0){
            int first [] = new int[size/2];
            int last [] = new int[size/2];

            for(int i=0;i<size;i++){
                if(i<size/2){
                    first[i] = arr[i];
                }
                else
                    last[size-i-1] = arr[i];
            }
            Arrays.sort(first);
            Arrays.sort(last);

            for(int i=0;i<size/2;i++){
                arr[i] = first[i];
            }

            int a = size/2;

            for(int i=size/2-1;i>=0;i--){
                arr[a]= last[i];
                a++;
                }
        }
        else{
            int first [] = new int[size/2];
            int last [] = new int[size/2+1];

            for(int i=0;i<size;i++){
                if(i<size/2){
                    first[i] = arr[i];
                }
                else
                    last[size-i-1] = arr[i];
            }
            Arrays.sort(first);
            Arrays.sort(last);

            for(int i=0;i<size/2;i++){
                arr[i] = first[i];
            }

            int a = size/2;

            for(int i=size/2;i>=0;i--){
                arr[a]= last[i];
                a++;
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
    }


    }
}
