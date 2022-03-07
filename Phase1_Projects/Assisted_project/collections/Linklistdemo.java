package collections;
import java.util.*;
public class Linklistdemo
{

	public static void main(String[] args) 
	{
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("edge");  
	      names.add("John"); 
	      names.add("king");
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext())
	      {  
	       System.out.println(itr.next());  
	      }
	}
}
