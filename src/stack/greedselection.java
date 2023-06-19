package stack;

public class greedselection {
    public static void method(int start[],int end[])
    {
    	int i=0;
    	System.out.print(i+" ");
    	
    	for(int j=1;j<=start.length-1;j++)
    	{
    		if(start[j]>=end[i])
    		{
    			System.out.print(j+" ");
    			i=j;
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start[]= {1,3,0,5,8,5};
		  int end[]= {2,4,6,7,9,9};
		method(start,end);
		

	}

}
