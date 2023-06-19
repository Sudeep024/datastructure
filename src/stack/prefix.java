package stack;

import java.util.Stack;

public class prefix {
	public static boolean operator(char c){
		if(c>=48 && c<=57)
		{
			return true;
		}
		return false;
	}
    public static int method(String s)
    {
    	Stack<Integer> s1=new Stack<Integer>();
    	for(int i=s.length()-1;i>=0;i--)
    	{
    		if(operator(s.charAt(i)))
    		{
    			s1.push((int) s.charAt(i)-48);
    		}
    		else {
    			int a=s1.pop();
    			int b=s1.pop();
    			switch(s.charAt(i))
    			{
    			case '+':
    				 s1.push(a+b);
    				   break;
    			case '-':
    				s1.push(a-b);
    				 break;
    			case '*':
    				s1.push(a*b);
    			case '/':
    				s1.push(a/b);
    				break;
    			}
    		}
    	}
    	return s1.peek();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="-+8/632";
		int a=method(s);
		System.out.println(a);

	}

}
