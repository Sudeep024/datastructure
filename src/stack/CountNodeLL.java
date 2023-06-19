package stack;

public class CountNodeLL {
	 static node head; static int c=0;
	 static class node{
		 int data;
		 node next;
		 node(int d)
		 {
			 data=d;
			 next=null;
		 }
	 }
   public static void ins(int a) {
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
   public static void end(int a)
   {
	   node last=head;
	   node last_node=new node(a);
	   while(last.next!=null)
	   {
		   last=last.next;
		   
	   }
	   last.next=last_node;
   }
   public static void disp()
   {
	   
	   node temp=head;
	   while(temp!=null)
	   {
		   System.out.print(temp.data+" ");
		   temp=temp.next;
		   c++;
		   
	   }
   }
   public  static void delete()
   {
	   if(head==null)
	   {
		  System.out.print("there is node in linked list"); 
	   }
	   else {
		   head=head.next;
	   }
   }
   public static void lastdelete()
   {
	   node last_node=head;
	   while(last_node.next.next!=null)
	   {
		   last_node=last_node.next;
	   }
	   last_node.next=null;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ins(3);
		ins(4);
		ins(6);
		end(8);
         disp();
         lastdelete();
         delete();
         
         System.out.println();
         disp();
         System.out.println("numver of node are  "+c);
	}

}
