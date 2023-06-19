package stack;

public class SearchLL {
	static Node head;
	static class Node{
		int data;
		Node Next;
		Node(int a){
			data=a;
			Next=null;
		}
		
	}
	public static void ins(int a)
	{
		Node n=new Node(a);
		if(head==null)
		{
			head=n;
		}
		else {
			n.Next=head;
			head=n;
			
		}
	}
    public static void disp()
    {
    	Node n=head;
    	while(n!=null)
    	{
    		System.out.println(n.data);
    		n=n.Next;
    	}
    }
    public static boolean search(int d)
    {
    	Node n=head;
    	while(n!=null)
    	{
    		if(n.data==d)
    		{
    			return true;
    		}
    	}
    	return false;
    }
    public static void delete()
    {
    	
    	while(head!=null)
    	{
    		if(head.Next == null)
    		{
    			System.out.println("all elements are deleted");
    		}
    		else {
    			System.out.println("deleted element is"+head.data);
    		}
    		head=head.Next;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ins(23);
		ins(43);
		ins(66);
		disp();
		if(search(66))
		{
			System.out.println(true);
		}
		else {
			System.out.println(false) ;
		}
		delete();
		delete();
		

	}

}
