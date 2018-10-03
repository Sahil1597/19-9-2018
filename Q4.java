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
	node head1 = null;
	
	void insert(int d)
	{
	node temp = new node(d);

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
	
	void check()
	{
		node curr = head;
		node ptr = null;
		node prev = null;
		
		while(curr != null)
		{
		ptr = curr.next;
		curr.next = prev;
		prev = curr;
		curr = ptr;
		}
		head1 = prev;
		
		node a = head1;
		
		
		node h = head;
		node j = head1;
		
		while(h != null && j != null)
		{
			if(h.data != j.data)
			{
			System.out.print("Not Palindrome ");	
			}
			else
			{
			System.out.print("Palindrome ");	
			}
		h = h.next;
		j = j.next;
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
		System.out.println('\n');
	}
}

class Q4
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
		System.out.print("Linked List is ");
		obj.display();
		
		obj.check();
	}
}