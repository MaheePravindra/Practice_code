import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> AR = new ArrayList<>(10);
        for(int i=0;i<20;i++){
            AR.add(i);
        }
        for(int i=0;i<AR.size();i++){
            System.out.println(AR.get(i));
        }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialize the array list with arraylist
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }

        //add elements
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
