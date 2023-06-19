package stack;

import java.util.ArrayList;

public class RemovedupicateBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList<Character> li=new ArrayList<Character>();
          String s1="(ab)))";
          for(int i=0;i<=s1.length()-1;i++)
          {
        	  li.add(s1.charAt(i));
          }
          System.out.println(li);
          for(int i=0;i<=li.size()-1;i++)
          {
        	  if(li.get(i)=='(')
        	  {
        		  for(int j=li.size()-1;j>i;j--)
            	  {
            	     if(li.get(j)==')')
            	     {
            	    	 System.out.println(j);
            	     }
            	     else {
            	    	 li.remove(j);
            	    	 li.remove(j);
            	    	 System.out.println(i+" "+j);
            	     }
            	  } 
        	  }
        	 
          }
          System.out.println(li);
	}

	
	
	

}
