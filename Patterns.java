import java.util.*;

/*Approach
 * (1) No. of lines = No. of rows = No. of times outer loop will run
 * (2) Identify for each row number
 *     a. how many columns are there
 *     b. Type of elements in columns
 * (3) What do you need to print
 * Note: Try to find the formula relating rows and cols
 */
public class Patterns {

    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern28(n);
        System.out.println();
        pattern30(n);
        System.out.println();
        pattern31(n);
    }

    static void pattern1(int n){
        for(int i=1; i<=n; i++){
            //for every row run the column
            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            }
            //when one row is printed , we need to add a new line
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i=0; i<2*n; i++){
            int c = 0;
            if(i>n)
                c = 2*n-i;
            else
                c = i;    
            //for every row run the column
            for(int j = 0; j<c; j++){
                System.out.print("* ");
            }
            //when one row is printed , we need to add a new line
            System.out.println();
        }
    }

    static void pattern28(int n){
        for(int i=0; i<2*n; i++){
            int c = 0;
            
            if(i>n)
                c = 2*n-i;
            else
                c = i; 
            int spaces = n-c;
            for(int k=0;k<spaces;k++){
                System.out.print(" ");
            }       
            //for every row run the column
            for(int j = 0; j<c; j++){
                System.out.print("* ");
            }
            //when one row is printed , we need to add a new line
            System.out.println();
        }
    }

    static void pattern30(int n){
        for(int i=1; i<=n; i++){
            //for every row run the column
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j = i; j>=1; j--){
                System.out.print(j+" ");
            }

            for(int j = 2; j<=i; j++){
                System.out.print(j+" ");
            }
            //when one row is printed , we need to add a new line
            System.out.println();
        }
    }

    static void pattern31(int n){
        int Original = n;
        n=2*n;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                int val = Original - Math.min(Math.min(j,i),Math.min(n-j,n-i));
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
