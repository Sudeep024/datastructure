package stack;

public class Queue{
	static int a[];
	static int top=0; 
	public static void  create(int size)
	{
		a=new int[size];
	}
	public static void enqueue(int n)
	{
		if(top==a.length-1)
		{
			System.out.println("queue is full");
		}
		else {
			a[top]=n;
			top++;
		}
	}
	public static void disply()
	{
		if(top==0)
		{
			System.out.println("queue is empty");
		}
		
		else {
			System.out.println("queue elements are");
			for(int i=0;i<=top-1;i++)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("________________");
	}
	public static void dequeue()
	{
		if(top==0)
		{
			System.out.println("queue is empty");
		}
		else {
			 System.out.println("deleted elemts are"+a[0]);
			for(int i=0;i<=top;i++)
			{
			 
				a[i]=a[i+1];
			}
			top--;
		}
	}
	public static boolean isempty()
	{
		if(top==0)
		{
			System.out.println("is empty");
			return true;
		}
		return false;
	}
	public static boolean isfull()
	{
		if(top==a.length-1)
		{
			System.out.println("is full");
			return true;
		}
		else {
			System.out.println("is not full ");
			return false;
		}
	}
	public static void peek()
	{
		if(isfull()!=true)
		{
			System.out.println(a[0]);
		}
		else {
			System.out.println(-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		create(5);enqueue(6);	enqueue(5);enqueue(32);
		disply();
		dequeue(); dequeue();  disply();
		dequeue(); dequeue();disply();isfull();peek();
	}

}




