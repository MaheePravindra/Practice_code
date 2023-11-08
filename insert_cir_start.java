import java.lang.*;
import java.util.*;

public class insert_cir_start {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //Represent the head and tail of the singly linked list  
    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newnode = new Node(data); //Create a new node  

        if(head==null){
            //If list is empty, both head and tail will point to new node  
            head = newnode;    
            tail = newnode;  
        }
        else{
            tail.next = newnode;  //newNode will be added after tail such that tail's next will point to newNode
            tail = newnode;  //newNode will become new tail of the list 
            tail.next=head; 
        }
    }

    public void Display(){
        int count=0;
        Node current = head; //Node current will point to head  
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of Circular Linked list: ");
        do{
            System.out.print(current.data+" ");
            current = current.next;
            count++;
        }while(current!=head);
        System.out.println();
        System.out.println("No. of elements:"+count);
        System.out.println(current.data);
    }
    public void insertatbeg(int val){
        Node datanode = new Node(val);
        tail.next=datanode;
        datanode.next=head;
        head=datanode; //Remove this statement in case of insertion at end
    }public void insertatend(int val){
        Node datanode = new Node(val);
        tail.next=datanode;
        datanode.next=head;
        //head=datanode; //Remove this statement in case of insertion at end
    }

    public static void main(String[] args) {
        insert_cir_start LL = new insert_cir_start();
        LL.addNode(1);
        LL.addNode(2);
        LL.addNode(3);
        LL.addNode(4);
        LL.addNode(6);
        LL.Display();
        LL.insertatbeg(8);
        LL.Display();
        LL.insertatend(9);
        LL.Display();
    }
    
}
