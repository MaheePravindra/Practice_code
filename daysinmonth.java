import java.util.*;
import java.lang.*;
public class daysinmonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days=0;
        System.out.print("Enter Year:");
        int year = sc.nextInt();
        System.out.print("Enter Month number:");
        int mon = sc.nextInt();
        if(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12){
            days=31;
        }
        else if(mon==4||mon==6||mon==9||mon==11){
            days=30;
        }
        else if(mon==2){
            if(year%4==0){
                if(year%100==0&&year%400!=0){
                    days=28;
                }
                else{
                    days=29;
                }
            }
            else{
                days=28;
            }
        }
        System.out.println("Number of days in "+mon+" in the year "+year+": "+days);
    }
    
}
