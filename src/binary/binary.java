package binary;

public class binary {
	static Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int n)
		{
			data=n;
			left=null;
			right=null;
		}
	}
	public static void disp(Node node)
	{
		
		if(node==null)
		{
			return;
		}
		System.out.println(node.data);
		disp(node.left);
		
		disp(node.right);

		
	}
	public static void main(String args[])
	{
		Node node=new Node(23);
		 root=node;
		 Node node1 =new Node(24);
		 root.left=node1;
		 Node node2=new Node(32);
		 Node node3=new Node(35);
		 root.right=node2;
		 root.left.left=node3;
		 disp(node);
		 
		
	}

}
