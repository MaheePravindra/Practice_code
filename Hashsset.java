import java.util.*;
public class Hashsset {
    public static void main(String[] args) {
        //Hash set does not contains duplicate elements
        HashSet<Integer> set = new HashSet<>();
        for(int i=1; i< 6; i++){
            set.add(i);
        }
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Set does not contain 6");
        }
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Set does not contains 1");
        }
        System.out.println(set.size());
        System.out.println(set);
        Iterator it = set.iterator();

        // it.next() and it.hasNext() for iterating

        while(it.hasNext()){
            System.out.println(it.next());
        }

        
    }
}
