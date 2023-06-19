package stack;

import java.util.Stack;

public class StakSort {
    public static Stack<Integer> method(Stack s)
    {
    	Stack<Integer> s2= new Stack<Integer>();
    	while(! s.isEmpty())
    	{
    		int temp=(int) s.pop();
    		while(!s2.isEmpty() && s2.peek()>temp)
    		{
    			s.push(s2.pop());
    		}
    		s2.push(temp);
    	}
    	return s2;
    }
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack<Integer>();
		   s.add(12);
		   s.add(1);
		   s.add(43);
		   s.add(42);
		   s.add(2);
		  Stack<Integer> temp =method(s);
		  for(int i:temp)
		  {
			  System.out.println(i);
		  }
		   
	}
}
