package stack;

public class MissingNumber {
     public static void method(int a[])
     {
    	 int n=a.length+1;
    	 int sum=(n/2)*(a[0]+a[a.length-1]);
    	 System.out.println(sum);
    	 
    	 for(int i=0;i<=a.length-1;i++)
    	 {
    		 sum-=a[i];
    	 }
    	 System.out.println(sum  );
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {3,4,5,7,8};
       
        method(a);
      
	}

}
