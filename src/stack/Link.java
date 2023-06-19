package stack;

public class Link {
	LinkedList head;
	void insertInto(int a)
	{

		 LinkedList n =new LinkedList(12);
		if(head==null)
		{
		   head =n;	
		}
		else {
			LinkedList temp=head;
			while(temp.next==null)
			{
				temp=temp.next;
				System.out.println(temp);
			}
			temp.next=n;
		}
		System.out.println(a);
		System.out.println(head);
	}
void display() {

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link l=new Link();
		l.insertInto(12);
		l.insertInto(13);
	}

}
