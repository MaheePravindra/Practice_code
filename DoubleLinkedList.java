import java.util.*;
public class DoubleLinkedList {
    class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
            this.next = null;
            this.prev = null;
        }

    }
    Node head = null;
    public void insertFirst(int val){
        Node newnode = new Node(val);
        newnode.next = head;
        newnode.prev = null;
        if(head!=null){   
            head.prev = newnode;
        }
        head = newnode;
    }

    public void insertLast(int value){
        Node newnode = new Node(value);
        if(head==null){
            newnode.next = null;
            newnode.prev = null;
            head = newnode;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;
        newnode.next = null;
    }

    public void insertAfter(int after, int value){
        Node P = find(after);
        if(P==null){
            System.out.println("Does not exist");
            return;
        }
        Node newnode = new Node(value);
        newnode.next=P.next;
        if(P.next!=null){
            P.next.prev = newnode;
        }
        
        P.next = newnode;
        newnode.prev = P;

    }

    public Node find(int value){
        Node newnode = head;
        while(newnode!=null){
            if(newnode.val==value){
                return newnode;
            }
            newnode = newnode.next;
        }
        return null; 
    }
    public void display(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            last = temp;
            temp = temp.next;
            
        }
        System.out.print("END");
        System.out.println();
        while(last!=null){
            System.out.print(last.val+" -> ");
            last = last.prev;
            
        }
        System.out.print("START");
        System.out.println();
    }
    

    public static void main(String[] args) {
        DoubleLinkedList DLL = new DoubleLinkedList();
        DLL.insertFirst(22);
        DLL.insertFirst(3);
        DLL.insertFirst(9);
        DLL.insertFirst(15);
        DLL.display();
        DLL.insertLast(66);
        DLL.display();
        DLL.insertAfter(9,14);
        DLL.display();
    }
}
