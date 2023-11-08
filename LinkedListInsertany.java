import java.lang.*;
import java.util.*;

class LinkedList {
    Node head;
    int size = 0;
    // Node Class
    class Node{
        int data;
        Node next;

        Node(int x) // parameterized constructor
        {
            data = x;
            next = null;
        }
    }
    public void insert(int data)
    {
        Node new_node = new Node(data);

        new_node.data = data;
        new_node.next = head;
        head = new_node;
        size++;
    }
    public void insertPosition(int pos, int data) {
        Node new_node = new Node(data);
        new_node.data = data;
        new_node.next = null;

        // Invalid positions
        if(pos < 1 || pos > size + 1)
            System.out.println("Invalid\n");

            // inserting first node
        else if(pos == 1){
            new_node.next = head;
            head = new_node;
            size++;
        }

        else
        {
            Node temp = head;

            // traverse till the current (pos-1)th node
            while(--pos > 1){
                temp = temp.next;
            }
            new_node.next= temp.next;
            temp.next = new_node;
            size++;
        }
    }

    public void display()
    {
        System.out.print("Linked List : ");

        Node node = head;
        // as linked list will end when Node is Null
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
public class LinkedListInsertany{
    public static void main(String args[])
    {
        LinkedList linked_list = new LinkedList();

        linked_list.insert(7);
        linked_list.insert(6);
        linked_list.insert(4);
        linked_list.insert(3);
        linked_list.insert(1);

        linked_list.display();

        // Inserts value: 2 at 2nd position
        linked_list.insertPosition(2, 2);

        // Inserts value: 5 at 5th position
        linked_list.insertPosition(5, 5);

        // Inserts value: 8 at 8th position
        linked_list.insertPosition(8, 8);

        linked_list.display();
    }


}
