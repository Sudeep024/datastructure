package stack;
//Map:-is data structure where it is to store hetirogenous and homogeneos value 
//in map data will be stored in terms of key and value pair where key is unique 
//value can be duplicated 

public class Map {
  static int hashmap[];
  static int hash;
  static void createhash(int size)
  {
	 hashmap=new int[size];
	 hash=size;
	System.out.println(size);
	
  }
  static void insert(int ele)
  {
	  int index=ele%hash;
	  if(hashmap[index]==0)
	  {
		hashmap[index]=ele;  
	  }
	  else {
		  System.out.println("value occupied");
	  }
  }
   static void  disp()
   {
	 for(int i=0;i<=hashmap.length-1;i++)
	 {
		 System.out.print(hashmap[i]+" `");
	 }
	 System.out.println();
   }
   static void delete(int del)
   {
	  int idex=del%hash;
	  if(hashmap[idex]==del)
	  {
		  hashmap[idex]=0;
	  }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 createhash(12);
		insert(12);
		insert(54);
		disp();
		delete(12);
		delete(54);
		disp();

	}

}
