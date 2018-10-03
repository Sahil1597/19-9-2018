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
	
	void swap(int n1,int n2)
	{
		
		node ptr = head;
		int count  = 0;
		node a = null;
		node b = null;
		
		while(ptr != null)
		{
			if(count == n1)
			a = ptr;
		
			if(count == n2)
			b = ptr;
		
		count++;	
		ptr = ptr.next;	
		}
		int temp = a.data;
		a.data = b.data;
		b.data = temp;
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

class Q1
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
		
		System.out.print("Enter the first index ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter the second index ");
		int n2 = sc.nextInt();
		
		if(n1<0 || n1>=n && n2<0 || n2>=n)
		System.out.print("Invalid index ");
	
		else
		obj.swap(n1,n2);
		System.out.print("After swapping ");
		obj.display();
	}
}