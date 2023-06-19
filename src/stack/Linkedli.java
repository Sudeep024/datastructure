package stack;

public class Linkedli {
	class Node{    
		int data;    
		Node next;    

		public Node(int data) {    
			this.data = data;    
			this.next = null;    
		}    
	}
	public Node head = null;    
	public void addNode(int data) {    

		Node newNode = new Node(data);    


		if(head == null) {    

			head = newNode; 
			System.out.println(data+" "+head);

		}

		else {
			Node temp = head;
			System.out.println(temp.next);
//			temp.next=newNode;
			while(temp.next!=null)
			{
				System.out.println("hello");
				temp=temp.next;
				System.out.println(temp);
			}
		       temp.next=newNode;
		       temp=temp.next;
			System.out.println(temp.next);
		}

	}
	public void newele(int a)
	{
		
		 Node newNode =new Node( a);
		if(head==null)
		{
		  head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	public void insert(int a,int pos)
	{
		
	}
	public void display() {    



		if(head == null) {    
			System.out.println("List is empty");    

		}    
		System.out.println("Nodes of singly linked list: ");    
		while(head != null) {    

			System.out.println(head.data + " "+head.next);    
			head = head.next;    
		}    
		System.out.println();    
	}    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedli sList = new Linkedli();    


		sList.addNode(1);    
		sList.addNode(2);    
		sList.addNode(3);    
		sList.addNode(4);    
//
//		sList.newele(6);
		sList.display();  
//		sList.insert(45, 4);

	}

}
