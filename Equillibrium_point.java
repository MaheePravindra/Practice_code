import java.util.*;
public class Equillibrium_point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int temp=0, s1=0, s2=0;
        int[] a = new int[l];
        for(int i=0; i<l; i++){
            a[i] = sc.nextInt();
        }
        if(l==1){
            System.out.println("It is in equillibrium");
        }
        else if(l==2){
            if(a[1]==0){
                //System.out.println("It is in equillibrium");
            }
            else{
                
            System.out.println("It is not in equillibrium");
            }
        }
        else{
            for(int i=0; i<l; i++){
                s1+=a[i];
            }
            for(int i=0; i<l; i++){
                s2+=a[i];
                if(s1!=s2){
                    s1-=a[i];
                }
                else if(s1==s2){
                    temp=i;
                }
            }
        }
        /*else{
            for(int i=0; i<l; i++){
                int num = i;
                for(int j=0;j<num;j++){
                    s1+=a[j];    
                }
                for(int j=num+1;j<l;j++){
                    s2+=a[j];
                }
                if(s1==s2){
                temp=i;
                break;
            
            }
                s1=0;
                s2=0;
            }
            
            
        }*/
        System.out.println("Array at eqillibrium at "+temp);
        sc.close();
    }
}
