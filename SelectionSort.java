import java.util.*;
public class SelectionSort {
    public static void InsertionSort(int[] arr){
        for(int i=0; i<arr.length;i++){
          int last= arr.length-i-1;
          int getMaxi= getMax(arr, 0, last);
          swap(arr, getMaxi, last);
          
      }
    }
   public static int getMax(int[] arr, int start, int end){
        int max=start;
      for(int i=start; i<=end;i++){
          if(arr[max]<arr[i]) max=i;
      }
      return max;
    }
  public static void swap(int[] arr, int j, int k ){
        int temp= arr[j];
        arr[j]=arr[k];
        arr[k]=temp;

}
    public static void main(String[] args) {
        int[] lola={223,-13,-33,400,-32,48};
        InsertionSort(lola);
        System.out.println(Arrays.toString(lola));

    }
}
