package stack;

public class MinValIndex {
     public static int method(int a[])
     {
    	 int min=a[0];int min_index=0;
    	 for(int i=0;i<=a.length-1;i++)
    	 {
    		 if(min>a[i])
    		 {
    			 min=a[i];
    			 min_index=i;
    		 }
    	 }
    	 return min_index;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {15, 18, 2, 3, 6, 12};
		System.out.println(method(a));

	}

}
