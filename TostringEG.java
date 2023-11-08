import java.util.*;
public class TostringEG {

    static boolean isPalindrome(String str){

        if(str==null||str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        for(int i=0; i< str.length()/2; i++){
            char Start = str.charAt(i);
            char End = str.charAt(str.length()-1-i);
            if(Start!=End){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        System.out.println(Arrays.toString(arr));

        String str = "ManannanaM";
        System.out.println(isPalindrome(str));

        String str2 = "Hello World";
        System.out.println(Arrays.toString(str2.split(" ")));

        int[] arr1 = {2,4,6,8,10,12};


        //for each loop syntax
        for(int i: arr1){
            System.out.print(i+" ");
        }

    }
}
