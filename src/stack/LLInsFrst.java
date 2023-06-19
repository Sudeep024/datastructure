package stack;

import stack.NwLink.node;

public class LLInsFrst {
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
   public void print()
   {
	   Node n=head;
	 while(n!=null)
	 {
		 System.out.println(n.data);
		 n=n.next;
	 }
   }
   public void f(int n)
   {
	   Node new_node=new Node(n);
	   new_node.next=head;
	   head=new_node;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLInsFrst l=new LLInsFrst();
		l.head=new Node(23);
		 Node s=new Node(3);
		 l.head.next=s;
		 l.print();
		 l.f(43);
		 l.print();
		

	}

}
