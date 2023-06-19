package stack;

public class MiddLL {
	static node head;
	 static class node{
		int data;
		node next;
		node(int a)
		{
			data=a;
		}
	}
	public static void addele(int a)
	{
	      node new_node=new node(a);
	      if(head==null)
	      {
	    	  head=new_node;
	      }
	      else {
	    	  new_node.next=head;
	    	  head=new_node;
	      }
	}
	static int len;
	public static void len()
	{
		node temp=head;
	  while(temp!=null)
	  {
		  System.out.println(temp.data);
               len++;
	        temp=temp.next;
	  }  
	}
	public static void middle()
	{
		node temp=head; int middle=len/2;
		 while(middle!=0)
		 {
			 temp=temp.next;
			 middle--;
		 }
		 System.out.println(temp.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addele(12);
		addele(54);
		addele(76);
		addele(87);
		len();
		System.out.println("total length of linked list is"+len);
		middle();

	}

}
