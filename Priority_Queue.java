import java.util.*;
import org.w3c.dom.Node;

public class Priority_Queue {

    static class Node {
        int data;
        int priority;
        Node next;
    }
    
    static Node node = new Node();
        
    static Node newNode(int d, int p)
    {
        Node temp = new Node();
        temp.data = d;
        temp.priority = p;
        temp.next = null;
        
        return temp;
    }
        
    static int peek(Node head)
    {
        return head.data;
    }
        
    static Node dequeue(Node head)
    {
        Node temp = head;
        head = head.next;
        return head;
    }
        
    static Node enqueue(Node head, int d, int p)
    {
        Node start = head;
        Node temp = newNode(d, p);
        
        if (head.priority < p) {
            temp.next = head;
            head = temp;
        }
        else {
            while (start.next != null &&
                start.next.priority > p) {
                start = start.next;
            }
        
            temp.next = start.next;
            start.next = temp;
        }
        return head;
    }
        
    static int isEmpty(Node head)
    {
        return (head == null)?1:0;
    }
        
    public static void main(String args[])
    {
        Node pq = newNode(5, 1);
        pq =enqueue(pq, 6, 2);
        pq =enqueue(pq, 1, 10);
        pq =enqueue(pq, 4, 8);
        pq =enqueue(pq,3,5);
        
        while (isEmpty(pq)==0) {
            System.out.printf("%d ", peek(pq));
            pq=dequeue(pq);
        }    
    }
}
