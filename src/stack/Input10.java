package stack;

public class Input10 {
	public static int con(char i)
	{
		int n=i-48;
		//System.out.println(n);
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="a1b9";
        char s1[]=s.toCharArray();int a=0;
        for(int i=0;i<=s1.length-1;i++)
        {
        	if(s1[i]>='0' && s1[i]<='9')
        	{
        		int n=con(s1[i]);
        		for(int j=1;j<=n;j++)
        		{
        			System.out.print(s1[i-1]);
        		}
            	
        	}
        
        }
        
	}

}
