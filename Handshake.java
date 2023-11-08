import java.util.*;
public class Handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int handshake = (n*(n-1))/2;
        System.out.println("Possible Handshakes: "+handshake);
    }
}
