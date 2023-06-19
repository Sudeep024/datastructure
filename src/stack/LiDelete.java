package stack;

public class LiDelete {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int n)
		{
			data=n;
			next=null;
		}
	}
	public static  void push(int n)
	{
		Node new_node=new Node(n);
		if(head==null)
		{
			head=new_node;
		}
		else {
			new_node.next=head;
			head=new_node;
		}
	}
	public static void delete()
	{
		if(head==null) {
			System.out.println("there is no node");
		}
		head=head.next;
	}
	public static void d()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            push(8);push(4);push(3); delete();
            d();
	}

}
