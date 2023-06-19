package stack;

public class Dli {
	static node head;
	static node tail=null;
	 static class node{
		int data;
		node prev;
		node next;
		node(int d)
		{
			data=d;
			prev=null;
			next=null;
		}
		
	}
    public static void addNode(int a)
    {
    	node new_node=new node(a);
    	if(head==null)
    	{
    		head=tail=new_node;
    		head.prev=null;
    		tail.next=null;
    	}
    	else {
    		tail.next=new_node;
    		new_node.prev=tail;
    		tail=new_node;
    		tail.next=null;
    	}
    }
    public static void disp()
    {
    	node current=head;
    	while(current!=null)
    	{
    		System.out.print(current.data+" ");
    		current=current.next;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNode(32);
		addNode(65);
		addNode(21);
		disp();

	}

}
