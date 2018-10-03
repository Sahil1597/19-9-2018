import java.util.*;
class node
{
	int data;
	node next;
	
	node(int data)
	{
	this.data = data;	
	}
}

class demo
{
	node head = null;

	void insert(int x)
	{
	node temp = new node(x);
	
		if(head == null)
		{
		head = temp;
		temp.next = null;
		}
		
		else
		{
		node ptr = head;
		
			while(ptr.next != null)
			{
			ptr = ptr.next;	
			}
			ptr.next = temp;
			temp.next = null;
		}
	}
	
	void reverse()
	{
		node curr = head;
		node prev = null;
		node ptr = null;
		
		while(curr != null)
		{
		ptr = curr.next;	
		curr.next = prev;
		prev = curr;
		curr = ptr;
		}
		head = prev;
	}
	
	void display()
	{
		node ptr = head;
		while(ptr != null)
		{
		System.out.print(ptr.data+" ");
		ptr = ptr.next;
		}
		System.out.println();
		System.out.println();
	}
}

class Q5
{
	public static void main(String x[])
	{
		demo obj = new demo();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size ");
		int n = sc.nextInt();
		
		System.out.print("Enter the elements ");
		for(int i=0;i<n;i++)
		{
		int num = sc.nextInt();
		obj.insert(num);
		}
		System.out.println();
		System.out.println();
		System.out.print("Entered Linked list is ");
		obj.display();
		
		obj.reverse();
		System.out.print("After reversing linked list ");
		obj.display();
		
	}
}