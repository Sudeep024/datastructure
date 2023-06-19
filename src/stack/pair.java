package stack;

public class pair {
	int n1,n2;
	pair(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
    @Override
    public String toString()
    {
		return n1+" "+n2;   	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       pair[] p=new pair[4];
       for(int i=0;i<=3;i++)
       {
    	   p[i]=new pair(i,i);
       }
       for(int i=0;i<=p.length-1;i++)
       {
    	   System.out.println(p[i]);
       }
	}

}
