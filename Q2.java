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
	
	void remove()
	{
	node ptr = head;
	node pre = head;
	
		while(pre != null)
		{
			ptr = pre;
			
			while(ptr.next != null)
			{
				if(pre.data == ptr.next.data)
				{
				ptr.next = ptr.next.next;	
				}
				else
				{
				ptr = ptr.next;	
				}
			}
		pre = pre.next;	
		}
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

class Q2
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
		
		obj.remove();
		System.out.print("After removing duplicates ");
		obj.display();
	}
}