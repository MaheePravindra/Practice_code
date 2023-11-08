import java.util.*;
public class Stobogrammatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k=1;
        int ans=0,c=0;
        for(int i=0;i<s.length();i++){
            int num = s.charAt(i)-'0';
            if(num==9){
                num=6;
            }
            else if(num==6){
                num=9;
            }
            else if(num==1){
                num=1;
            }
            else if(num==0){
                num=0;
            }
            else if(num==8){
                num=8;
            }
            else{
                System.out.println("Not possible!");
                break;
            }
            ans= ans*10 + num;
            c += num*k;
            k=k*10;

        }
        if(ans!=0&&c!=0){
            System.out.println(ans);
            System.out.println(c);
        }
        
    }
}
