package stack;

public class CCercularLL {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;

		}

	}
	public static void addele(int n)
	{
		Node new_Node=new Node(n);
		if(head==null)
		{
			head=new_Node;
		}
		else {
			new_Node.next=head;
			head=new_Node;
		}
	}
	public static
	void circular()
	{
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
		}
		temp=head;
	}
	public static void disp()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addele(12);
		addele(43);
		addele(54);
		circular();
		disp();
	}

}
