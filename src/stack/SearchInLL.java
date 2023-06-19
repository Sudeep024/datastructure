package stack;

public class SearchInLL {
	static Node head;
	static class Node{
		 Node next;
		 int data; 
		 Node(int d)
		 {
			 data=d;
		 }
	 }
	 public static void addEle(int n)
	 {
		 Node New_node=new Node(n);
		 if(head==null)
		 {
			head=New_node; 
		 }
		 else {
			 New_node.next=head;
			 head=New_node;
		 }
	 }
	 public static void search(int n)
	 {
		 Node temp=head; int c=0;
		 while(temp!=null)
		 {
			 if(temp.data==n)
			 {
				 c++;
			 }
			 temp=temp.next;
		 }
		 System.out.println(c);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         addEle(23);
         addEle(23);
         addEle(23);
         addEle(23);
         addEle(23);
         addEle(2);
         search(23);
	}

}
