package stack;

public class givenMethamaticalEx {
	public static boolean method(String s)
	{
		char s1[]=s.toCharArray(); String s3="";

		for(int i=0;i<=s1.length-1;i++)
		{
			if(s1[i]=='(' ||s1[i]==')')
			{
				s3=s3+""+s1[i];
			}
		}
		System.out.println(s3);
		char[] s2=s3.toCharArray();
		int c=0;
		for(int i=0;i<=s2.length-1;i++)
		{
			if(s2[i]=='(')
			{
				for(int j=i+1;j<=s2.length-1;j++)
				{
					if(s2[j]==')')
					{
						c++;
						s2[j]='\0';
					}
				}
			}
		}
		System.out.println(c);
		if(c*2==s2.length) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean met(String s)
	{
		char s2[]=s.toCharArray();
		for(int i=0;i<=s2.length-1;i++)
		{
			if(s2[i]=='+'|| s2[i]=='-'||s2[i]=='*'||s2[i]=='/')
			{   
				System.out.println(i+" "+s2[i]);System.out.println(s2[i+1]);
			    if(!(s2[i+1]>='a' && s2[i+1]<='z') )
			    {
			    	
				   return false;
			    }
			    if(!(s2[i-1]>='a' && s2[i-1]<='z') )
			     {
			        	return false;
			     }
			     
			     

			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="(a+b)(a+b)";
		char []s2=s1.toCharArray();
		if(method(s1))
		{
			if( met(s1))
			{
				System.out.println("valid"); 
			}
			else {
				System.out.println("not valid");
			}

		} 
		else {
			System.out.println("not valid");
		}

	}

}
