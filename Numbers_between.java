import java.util.*;
public class Numbers_between {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int u = sc.nextInt();
        int count=0;
        for(int i=l;i<=u;i++){
            if(i%10 ==1||i%10 ==4||i%10 ==9){
                int j=i, a=0;
                while(j>0){
                    if(j%10 ==1||j%10 ==4||j%10 ==9){
                        a=1;
                        j=j/10;

                    }
                    else{
                        a=0;
                        break;
                    }
                }
                if(a==1){
                    System.out.println(i);
                }
            }
    }
    }
}