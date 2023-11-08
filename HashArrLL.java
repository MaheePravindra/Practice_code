import java.util.*;
public class HashArrLL {
    static class HashMap<K, V> { //generics
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // total number of nodes
        private int N; // total number of buckets
        
        private LinkedList<Node> buckets[]; // N = buckets.length

        //constructor
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4]; //initialize the array
            for(int i=0; i<4; i++){
                //create new linked list at each bocket
                this.buckets[i] = new LinkedList<>(); 
            }
        }

        private int hashfunction(K key){
            //hashfunction always returns same output for same input
            int bi = key.hashCode(); //pre-defined function hashcode which returns any integer
            return Math.abs(bi) % N; //because value must lie between (0 and N-1)
            //abs because hashcode can also return negative value

        }

        private int SearchInLL(K key, int bi){
            LinkedList<Node> LL = buckets[bi];
            for(int i=0; i<LL.size(); i++){
                if(LL.get(i).key == key){
                    return i;
                }
            }

            return -1; //in case no such key exist
        }

        public boolean isEmpty(){
            return n==0;
        }

        private void rehash(){
            LinkedList<Node> OldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i=0; i< OldBucket.length; i++){
                LinkedList<Node> LL = OldBucket[i];
                for(int j=0; j<LL.size(); j++){
                    Node newnode = LL.get(j);
                    put(newnode.key, newnode.value);
                }

            }
        }
        public V get(K key){
            int bi = hashfunction(key); // returns a bucket index
            int di = SearchInLL(key, bi); // returns data index if key already exist in LL
            if(di == -1){ // key doesnt exist add new 
                return null;
            }
            else{ //key exists
                Node newnode = buckets[bi].get(di);
                return newnode.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++){//bi
                LinkedList<Node> LL = buckets[i];
                for(int j=0; j< LL.size(); j++){
                    Node newnode = LL.get(j);
                    keys.add(newnode.key);
                }
            }
            return keys;
        }

        public boolean containsKey(K key){
            int bi = hashfunction(key); // returns a bucket index
            int di = SearchInLL(key, bi); // returns data index if key already exist in LL
            if(di == -1){ // key doesnt exist add new 
                return false;
            }
            else{ //key exists
                return true;
            }
        }

        public V remove(K key){
            int bi = hashfunction(key); // returns a bucket index
            int di = SearchInLL(key, bi); // returns data index if key already exist in LL
            if(di == -1){ // key doesnt exist add new 
                return null;
            }
            else{ //key exists
                Node newnode = buckets[bi].remove(di);
                n--;
                return newnode.value;
            }

           
        }

        public void put(K key, V value){
            int bi = hashfunction(key); // returns a bucket index
            int di = SearchInLL(key, bi); // returns data index if key already exist in LL
            if(di == -1){ // key doesnt exist add new 
                buckets[bi].add(new Node(key, value));
                n++;
            }
            else{ //key exists
                Node newnode = buckets[bi].get(di);
                newnode.value = value;
            }

            double lambda = (double)n/N;
            if(lambda>2.0){
                //rehashing
                rehash();
            }

        }

        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("India", 120);
            map.put("China", 150);
            map.put("USA", 100);

            ArrayList<String> keys = map.keySet();
            for(int i=0; i< keys.size(); i++){
                System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
            }

            map.remove("India");
            System.out.println(map.get("India"));
        }
    }
}
