package stack;
public class LL {
	node head;
	class node{
		int a; node next;
		node(int a)
		{
			this.a=a;
		}


	}
	public void insert(int a)
	{
		node newnode=new node(a);
		if(head==null)
		{
			head=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
	}
	public void disp()
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.a);

			temp=temp.next;

		}
		System.out.println("_______________");
	}
	public void replace()
	{
//		node temp=head;
//		node ntemp=temp.next;
//		while(ntemp!=null)
//		{
//
//				node tmm=temp;
//			    temp=ntemp;
//			    System.out.println(temp.a);
//			    ntemp=ntemp.next;
//
//			
//		}
		 node current = head;
		 node prev = null; 
	        
	        while(current != null) { 
	            node next = current.next; 
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL l=new LL();
		l.insert(12);
		l.insert(13);
		l.insert(14);
		l.disp();
		l.replace();
         l.disp();
		

	}

}
