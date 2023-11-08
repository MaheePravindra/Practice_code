import java.util.*;
public class Maze {
    public static void main(String[] args) {
        System.out.println(possibleways(3,3));
        path("",3,3);
    }

    static int possibleways(int r, int c){
        if(r==1||c==1){
            return 1;
        }
        int left = possibleways(r-1, c);
        int right = possibleways(r, c-1);
        return left + right;
    }

    static void path(String p, int r, int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+"D",r-1,c);
        }
        if(c>1){
            path(p+"R",r,c-1);
        }
    }
}
