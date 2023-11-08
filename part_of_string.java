import java.util.*;

public class part_of_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int count=0;
        int ans=0;
        int i=0;
        int temp=0;
        
        while(temp<s2.length()){
            while(i<s2.length()){
                if(s1.charAt(i)==s2.charAt(temp)){
                    ans=1;
                    i++;
                    temp++;
                }
                else{
                    i++;
                }
                
            }
        }
        for(int j=0;j<s1.length();j++){
            System.out.println();
        }

    }
    
}
