package maps;
import java.util.*;
public class MapDemoClass
{

	public static void main(String[] args) 
	{
		//HASH_MAP
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"king");    
	      hm.put(2,"john");    
	      hm.put(3,"Catie");   
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet())
	      {    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	     
	      
	      //HASH_TABLE
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      ht.put(4,"Ben");  
	      ht.put(5,"jessie");  
	      ht.put(6,"Jack");  
	      ht.put(7,"Mary");  
	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet())
	      {    
	       System.out.println(n.getKey()+" "+n.getValue());  
	      }
	      
	      
		   //TREE_MAP   
	       TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
            map.put(8,"Annie");    
            map.put(9,"Rock");    
		    map.put(10,"Lissa");       
		    System.out.println("\nThe elements of TreeMap are ");  
		    for(Map.Entry l:map.entrySet())
		    {    
		    System.out.println(l.getKey()+" "+l.getValue());    
		    }
	       
	     }
     }


