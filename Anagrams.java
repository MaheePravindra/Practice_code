import java.lang.*;
import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        
        String s1 = "ccac";
        String s2 = "aacc";
        char a[] = s2.toCharArray();
        char b[] = s1.toCharArray();
        Boolean ans=true;
        int count=0;
        char temp;
        /*if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                for(int j = 0;j<s2.length();j++){
                    if(s1.charAt(i)==s2.charAt(j)){
                        count++;
                    }
                }
            }*/
        if(s1.length()==s2.length()){
            for(int i = 1; i<s1.length();i++){
                if(s1.charAt(i-1)<s1.charAt(i)){
                    temp = a[i-1];
                    a[i-1]=a[i];
                    a[i]=temp;
                }
                
            }
        for(int i = 1; i<s2.length();i++){
                if(s2.charAt(i-1)<s2.charAt(i)){
                    temp = b[i-1];
                    b[i]=b[i-1];
                    b[i]=temp;
                }}    
             
        for(int i=0;i<s1.length();i++){      
                if(a[i]!=b[i]){
                    ans=false;
                    break;
                }
                else{
                    ans=true;;
                }
            }
            
        }
        else{
            ans=false;
        }
        System.out.println(ans);
        
    }    
    
}
