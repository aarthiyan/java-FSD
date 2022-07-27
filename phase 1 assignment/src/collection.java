
import java.util.*;

public class collection {

	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("losangels");//
	      city.add("bangkok");    	   
	      System.out.println(city);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("billa");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(1); 
	      vec.addElement(2); 
	      System.out.println(vec);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("alan");  
	      names.add("phil");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(10);  
	       set.add(13);  
	       set.add(12);
	       set.add(14);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(1);  
	       set2.add(2);  
	       set2.add(3);
	       set2.add(4);	       
	       System.out.println(set2);
	      	} 
	      }  
	}