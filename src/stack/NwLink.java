package stack;

public class NwLink {
     node head;
        static class node
         {
        	 int data ;
        	 node next;
        	 node(int n){
        		data=n;
        		next=null;
        	 }
         }
         public void print()
         {
        	 node n=head;
        	 while(n!=null)
        	 {
        		 System.out.println(n.data);
        		 n=n.next;
        	 }
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             NwLink l=new NwLink();
               l.head=new node(1);
               node s=new node(3);
               node t=new node(2);
               l.head.next=s;
               s.next=t;
              l. print();
               
             
	}

}
