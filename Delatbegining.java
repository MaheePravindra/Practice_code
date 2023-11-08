import java.lang.*;
import java.util.*;
public class Delatbegining {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head= null;
    public Node tail= null;

    public void append(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void delete(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            head = head.next;
        }
    }
    public void Display(){
        Node temp = head; //Node temp will point to head  
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of Single Linked list: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Delatbegining DLL = new Delatbegining();
        DLL.append(0);
        DLL.append(1);
        DLL.append(2);
        DLL.append(6);
        DLL.append(9);
        DLL.Display();
        DLL.delete();
        DLL.Display();
        DLL.delete();
        DLL.Display();
    }
    
}
