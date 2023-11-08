import java.util.*;
public class Bus_Fare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        double fare = 5;
        int dis[] = {1500,2400,8000,4200,6200,1000};
        double tot=0;
        int distance=0;


        for(int i =start; i<end;i++){
            tot+=((double)dis[i]/1000)*fare;
            distance+=dis[i];
        }
        tot = Math.ceil(tot);
        if(tot<20){
            System.out.println("Gareeb, paidal jaa");
        }
        else{
            System.out.println("Total Fare: "+tot);
        }
        System.out.println("Total distance travelled: "+distance);
    }
    
}
