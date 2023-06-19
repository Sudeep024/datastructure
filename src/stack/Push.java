package stack;

public class Push
{
	static int n=5;
	static int a[]=new int[n];static int top=-1;
	static void  createstack(int a)
	{
		n=a;
	}
    static  void push(int n) 
     {
    	 if(top==a.length-1)
    	 {
    		 System.out.println("stack is full");
    	 }
    	 else {
    		 top++;
      	 a[top]=n;
      	 System.out.println(a[top]);
      	
    	 }  
     }
    static void  Display()
     {
    	 for(int i=0;i<=a.length-1;i++) 
    	 {
    		 System.out.print(a[i]+"  ");
    	 }
     }
   static void  pop()
    {
    	 if(top==-1)
    	 {
    		 System.out.println("stack is empty");
    	 }
    	 else {
    	 a[top]=0;
    	System.out.println(a[top]);
          top--;
    	 }
    	 
     }
    static void Disp()
     {
    	 for(int i=0;i<=a.length-1;i++) 
    	 {
    		 System.out.print(a[i]+"  ");
    	 }
     }public static void main(String[] args) {
 		// TODO Auto-generated method stub
       
    	 createstack(5);
         push(6);
         push(5);  push(5);  push(5);  push(5);  push(5);
        Display();
         pop();
         pop();
         pop();pop();pop();
        Display();
        Disp();
 	}

}
