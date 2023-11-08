import java.util.*;
public class Quick_sort {
    static void quicksort(int[] arr,int l, int h){
        if(l<h){
            int pivot = partition(arr,l,h);
            System.out.println(pivot);
                quicksort(arr,l,pivot-1);
                quicksort(arr,pivot+1,h);
            
        }
        
    }
    static int partition(int[] arr, int l, int h){

        int pivot = arr[l];
        int i= l;
        int j= h;
        while(i<j){
            while(arr[i]<=pivot)
                i++;
            while(arr[i]>pivot)
                j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }        
        }
        int temp = arr[j];
        arr[j] = arr[l];
        arr[l] = temp;
        return j;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int l = 0;
        int h = size-1;
        quicksort(arr,l,h);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
