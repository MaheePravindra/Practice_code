import java.lang.*;
import java.util.*;
public class Stack_1st {
    static final int Max=1000;
    int top;
    int a[] = new int[Max];

    boolean isEmpty(){
        return(top<0);
    }
    Stack_1st(){
        top =-1;
    }
    boolean push(int x){
        if(top>=(Max-1)){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[++top] = x;
            System.out.println(x + " Pushed into stack");
            return true;
        }
    }

    int pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x = a[top--];
            return x;
        }
    }
    
    int peek(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x = a[top];
            return x;
        }
    }

    void print(){
        for(int i = top; i>-1; i-- ){
            System.out.println(" "+a[i]);
        }
    }
    
    public static void main(String[] args) {
        Stack_1st s =new Stack_1st();
        s.push(10);
        s.push(20); 
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop()+" Element popped");
        System.out.println("Top element: "+s.peek());
        System.out.println("Elements present in stack: ");
        s.print();
    }
    
}
