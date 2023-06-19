package stack;

public class InserAtEndOfLink {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int n)
		{
			data=n;
			next=null;
		}
	}
	public static void last(int n)
	{
		Node last_node=new Node(n);
		Node n1=head;
		if(head==null)
		{
			head=new Node(n);
			return;
		}
		Node New_Node=new Node(n);
		//New_Node.next=null;
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=New_Node;

	}
	public static void disp()
	{
		Node n=head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		last(32);
		last(35);
		last(54);
		last(9);
		disp(); 
	}

}
