import java.util.*;
public class Binary_Search {

    private static int BinSeachAss(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            //find the mid element
            //not doing (start+end)/2 coz it is possible it may exceede the limit of Integer in java i.e. 2^31
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                //lies on LHS
                end = mid-1;
            }
            if(target > arr[mid]){
                //lies on RHS
                start = mid+1;
            }
        }
        return -1;
    }
    private static int BinSeachDes(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            //find the mid element
            //not doing (start+end)/2 coz it is possible it may exceede the limit of Integer in java i.e. 2^31
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(target > arr[mid]){
                //lies on LHS
                end = mid-1;
            }
            if(target < arr[mid]){
                //lies on RHS
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        if(arr[0]<=arr[size-1]){//compare the 1st and last element
            //Also called OrederAgnostic Binary search
             System.out.println(BinSeachAss(arr, target));
        }
        else{
            System.out.println(BinSeachDes(arr, target));
        }
       
    }
}
