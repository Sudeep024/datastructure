package stack;

public class NodeInsAtMiddle {
	   static Node head;
	   static class Node{
		   int data;
		   Node next;
		   Node(int d ){
			   data=d;
			   next=null;
		   }
	   }
	   public static void insert(int a)
	   {
		   Node n=new Node(a);
		   if(head==null)
		   {
			   head=n;
		   }
		   else {
			   n.next=head;
			   head=n;
		   }
	   }
       public static  void middle(int a,Node prev_node)
       {
    	   Node new_node=new Node(a);
    	   new_node.next=prev_node.next;
    	   prev_node.next=new_node;
    	   
       }
       public static void disp()
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
            insert(23);
            insert(32);
            insert(54);
            middle(2,head.next);
            disp();
	}
	

}
