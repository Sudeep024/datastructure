package stack;

public class corli {
	static class node{
		int v;
		node next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 node head = null;
	        node one = null;
	        node two = null;
	        node three = null;
              one =new node();
              two=new node();
              three=new node();
              one.v=1;
              two.v=2;
              three.v=3;
              one.next=two;
              two.next=three;
              three.next=null;
              head=one;
              while(one!=null)
              {
            	  System.out.println(one.v);
            	 one=one.next;
              }
         
	}

}
