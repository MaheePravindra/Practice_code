import java.util.*;
public class EG {
  public static void main(String[] args) {
    String name="";  
    //split the string based on the spaces given
    String[] arr=name.split("\\s+");
    int[] hehe=fun(arr);
    System.out.println(Arrays.toString(hehe));
        System.out.println(Arrays.toString(hehe));

  }
  static int[] fun(String[] name){
    int[] arr=new int[name.length];
    for(int i=0;i<arr.length;i++){
    	arr[i]=Integer.valueOf(name[i]);
    }
    return arr;
    }
}
