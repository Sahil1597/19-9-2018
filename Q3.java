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
	
	node insert(int d,node head1)
	{
	node temp = new node(d);
		
		if(head1 == null)
		{
		head1 = temp;
		temp.next = null;
		}
		
		else
		{
		node ptr = head1;
			while(ptr.next != null)
			{
			ptr = ptr.next;	
			}
			ptr.next = temp;
			temp.next = null;
		}
	return head1;	
	}
	
	node insert1(int a,node head2)
	{	
	node temp = new node(a);
		if(head2 == null)
		{
		head2 = temp;
		temp.next = null;
		}
		
		else
		{
		node ptr = head2;
			
			while(ptr.next != null)
			{
			ptr = ptr.next;	
			}
			ptr.next = temp;
			temp.next = null;
		}
	return head2;	
	}
	
	node merge(node head1,node head2)
	{
		if(head1 == null && head2 != null)
		return head2;
	
		else if(head1 != null && head2 == null)
		return head1;
	
		else
		{
			node ptr = head1;
			
			while(ptr.next != null)
			{
			ptr = ptr.next;	
			}
			ptr.next = head2;
		}	
		return head1;
	}
	
	void display1(node head2)
	{
		node ptr = head2;
		
		while(ptr != null)
		{
			System.out.print(ptr.data+" ");
			ptr = ptr.next;
		}
		System.out.println();
		System.out.println();
	}
	
	void display(node head1)
	{
		node ptr = head1;
		
		while(ptr != null)
		{
			System.out.print(ptr.data+" ");
			ptr = ptr.next;
		}			
		System.out.println();
		System.out.println();
	}
}

class Q3
{
	public static void main(String x[])
	{
	node head1 = null;
	node head2 = null;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of linked lsit I ");
		int n1 = sc.nextInt();
		demo obj = new demo();
		
		System.out.print("Enter the elements ");
		for(int i=0;i<n1;i++)
		{
			int num1 = sc.nextInt();
			head1 = obj.insert(num1,head1);
		}
		System.out.print("Linked List I  ");
		obj.display(head1);
		
		System.out.print("Enter the size of linked list II ");
		int n2 = sc.nextInt();
		
		System.out.print("Enter the elements ");
		for(int i=0;i<n2;i++)
		{
			int num2 = sc.nextInt();
			head2 = obj.insert1(num2,head2);
		}
		System.out.print("Linked List II ");
		obj.display1(head2);
		
		head1 = obj.merge(head1,head2);
		System.out.print("After merging linked list ");
		obj.display(head1);
	}
}