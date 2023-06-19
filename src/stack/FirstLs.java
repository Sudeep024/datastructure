package stack;

public class FirstLs {
	node head;
	class node
	{
		int data;node next;
		node(int a)
		{
			this.data=a;
		}
		
	}
	public void infirst(int a)
	{
		node newnode=new node(a);
		if(head==null)
		{
			head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
		
	}
	public void disp()
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			
			temp=temp.next;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstLs f=new FirstLs();
		f.infirst(12);
		f.infirst(13);
		f.disp();
		

	}

}
