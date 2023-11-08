import java.io.*;
public class mid_ele_ll{
	
	Node head; 
	static class Node {
	
		int data;
		Node next;
	
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public static mid_ele_ll insert(mid_ele_ll list, int data)
	{
		Node new_node = new Node(data);

		if (list.head == null) {
			list.head = new_node;
		}
		else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = new_node;
		}
		return list;
	}

	public static void printList(mid_ele_ll list)
	{
		Node currNode = list.head;
	
		System.out.print("LinkedList: ");

		while (currNode != null) {
			System.out.print(currNode.data + " ");
	
			currNode = currNode.next;
		}
	}
	
	public static int middle(mid_ele_ll list){
	    Node temp = list.head;
	    int count =0;
	    
	    while(temp!=null){
	        temp = temp.next;
	        count++;
	    }
	    
	    temp = list.head;
	    
	    count = count/2;
	    
	    if(count%2 ==0){
	        count--;
	    }
	    
	    while(count>0){
	        temp = temp.next;
	        count--;
	    }
	    
	    return temp.data;
	}
	
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		mid_ele_ll list = new mid_ele_ll();
	
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);
	
		printList(list);
		
		System.out.println();
		System.out.println(middle(list));
		
		
	}
}