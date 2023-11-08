
//Hash Map is internally implemented as an Array of linked list
import java.util.*;
public class HashMapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // country, population

        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("USA",30);
        map.put("China",150);
        System.out.println(map);
        map.put("China", 155);
        System.out.println(map);

        //searching
        System.out.println(map.containsKey("China"));
        System.out.println(!map.containsKey("China"));
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonasia"));

        //Iterating
        //Done using for-each loop
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue()+" ");
        }
        System.out.println();
        //Other method
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key + " "+map.get(key));
        }

        //delete elemets
        map.remove("China");
        System.out.println(map);
    }
}
