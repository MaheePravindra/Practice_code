import java.lang.*;
import java.util.*;
public class insertLL {  
  
    class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    //Represent the head and tail of the singly linked list  
    public Node head = null;  
    public Node tail = null;  
  
    //addAtStart() will add a new node to the beginning of the list  
    public void addAtStart(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //Node temp will point to head  
            Node temp = head;  
            //newNode will become new head of the list  
            head = newNode;  
            //Node temp(previous head) will be added after new head  
            head.next = temp;  

            
        }  
    }  
  
    public void display() {   
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding nodes to the start of the list: ");  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        insertLL sList = new insertLL();  
  
        sList.addAtStart(1);  
        sList.display();  
  
        sList.addAtStart(2);  
        sList.display();  
    
        sList.addAtStart(3);  
        sList.display();  
  
        sList.addAtStart(4);  
        sList.display();  
    }  
}