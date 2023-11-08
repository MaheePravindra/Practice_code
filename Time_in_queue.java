import java.util.*;

public class Time_in_queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int[] a = new int[people];
        int[] t = new int[people];
        int max=6;
        int sum=0;
        for(int i=0; i<people; i++){
            a[i] = sc.nextInt();
            t[i]=0;
        }
        int s=0;
        int count = people;
        for(int i=0; i< people; i++){
            for(int j=0; j<people; j++){
                if(a[j]>max){
                    
                    if(a[j]>=5){
                        t[j]+=7;
                        s+=t[j];
                    }
                    else{
                        t[j]+=2;
                        s+=t[j];
                    }
                    a[j]=a[j]-max;
                }
                else{
                    if(a[j]>=5){
                        t[j]+=7;
                        s+=t[j];
                    }
                    else{
                        t[j]+=2;
                        s+=t[j];
                    }
                }
                if(a[j]==0){
                    t[i]=t[j];
                }
            }
        }
        for(int i=0; i<people; i++){
            System.out.println(t[i]);
        }
        
        
    }
}
