import java.lang.*;
import java.util.*;

public class StackUsingLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top;
    StackUsingLL(){
        this.top = null;
    }

    public void push(int x){
        Node newnode = new Node(x);
        
        newnode.data=x;
        newnode.next=top;
        top=newnode;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public int peek(){
        if(!isEmpty()){
            return top.data;
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public void pop(){
        if(top==null){
            System.out.println("No elements in stack");
            return;
        }
        top = top.next;
    }
    public void display(){
        if(top==null){
            System.out.println("No elements is stack");
            System.exit(1);
        }
        else{
            Node temp = top;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        StackUsingLL SL = new StackUsingLL();
        Scanner sc = new Scanner(System.in);
        boolean ans = false;

        do{
            int item = sc.nextInt();
            switch(item){
                case 1:SL.push(20);
                    SL.push(30);
                    SL.push(40);
                    break;
                case 2:SL.pop();
                    break;
                case 3:System.out.println(SL.peek());
                    break;
                case 4:SL.isEmpty();
                    break;
                case 5:System.exit(0);
                case 6:SL.display();
                    break;                            
            }
            System.out.println("COntinue??");
            ans = sc.nextBoolean();
        }while(ans!=false);    
    }    
}
