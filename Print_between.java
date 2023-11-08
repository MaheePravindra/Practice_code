import java.util.*;
public class Print_between {
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the upper and lower limit");
		int lower = sc.nextInt();
		int upper = sc.nextInt();
		
		int a= lower;
		int b= upper; 
	
		int d2 =0;
		while(upper>0){
		    upper/=10;
		    d2++;
		}
		
	    
	    
	    for(int i=a;i<b;i++){
	        
	        int d1 =0;
	        int temp =i;
	        while(temp>0){
    		    temp/=10;
    		    d1++;
		    }
		    
		    int zeros = d2-d1;
            
		     if(zeros>0){
	            for(int j=0;j<zeros;j++){
	                System.out.print(0);
	            }
	        }
	       
	       System.out.print(i+" ");
	        
	    }
	    System.out.print(b);
	}

    
}
