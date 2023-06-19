package stack;

public class SumSubArr {
   public static int[] sum(int a[],int sum)
   {
	   int s=0; int left=0;
	  for(int i=0;i<=a.length-1;i++)
	  {
		  s+=a[i];
		  while(s>sum)
		  {
			  s=s-a[left];
			  left++;
		  }
		  if(sum==s)
		  {
			  System.out.println(left+" "+i);
		  }
		  
	  }
	  return a;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int a[]= {1,3,4,3,34,6};
		  int sum=41;
		  sum(a,sum);
	}

}
