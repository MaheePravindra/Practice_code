import java.util.*;
public class CircularLL {
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    Node head;
    Node tail;

    public void insert(int val){
        Node newnode = new Node(val);
        if(head==null){
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        newnode.next = head;
        tail = newnode;
    }
    public void delete(int value){
        Node temp = head;
        if(temp==null){
            return;
        }
        if(temp.val==value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = temp.next;
            if(n.val == value){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while(temp!=head);
    }

    public void display(){
        Node temp = head;
        do{
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }while(temp!=head);
        System.out.print(head.val);
        System.out.println();
    }
    public static void main(String[] args) {
        CircularLL CLL = new CircularLL();
        CLL.insert(22);
        CLL.insert(3);
        CLL.insert(7);
        CLL.insert(99);
        CLL.display();
        CLL.delete(3);
        CLL.display();
    }
}
