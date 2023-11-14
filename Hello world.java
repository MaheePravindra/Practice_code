import java.lang.*;
import java.util.Scanner;
class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Name, ");
        System.out.print("Roll Number, ");
        System.out.println("Branch");
        char ch='A';
        int asc = ch; //implicit type casting(lower to higher)
        System.out.println(asc);
        int b = 67;
        char ch2 = (char)b; //explicit type casting(higher to lower)
        System.out.println(ch2);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.print("Enter length=");
        int l = sc.nextInt();
        System.out.print("Enter breadth=");
        int br = sc.nextInt();
        int area = l*br;
        int par = 2*(l+br);
        System.out.println("Area="+area+", Parameter="+par);



    }
}
