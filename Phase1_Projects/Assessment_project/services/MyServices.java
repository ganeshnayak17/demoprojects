package services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyServices implements Services
{

	public List<String> retrieveFilesInAscendingOrder()
	{
		String[] fileArray = myfile.list();  
		List<String> filesCollection = new ArrayList<String>(); 
		
		for(String fileNames:fileArray)
			filesCollection.add(fileNames); 
		
		Collections.sort(filesCollection); 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("something went wrong !!");
		}
		return filesCollection; 
	}
	

	public boolean addFile(String fileName)
	{
	   File myFile = new File("D:/simplilearnprograms/Lockme_Application/Ganesh/"+fileName); 
	   boolean result = false;
	   try 
	   {
	           Thread.sleep(2000);
			   if(! myFile.exists())
			   {
					
						myFile.createNewFile(); 
						result = true;
			   }
	  	}
		  catch(InterruptedException e)
		  {
			  System.err.println("something went wrong !!");
		  }
		  catch(IOException e)
		  {
			  System.err.println("something went wrong !!");
	
		  }
	     return result; 
	}
	
	public boolean deleteFile(String fileName)
	{
		String[] fileArray = myfile.list(); 
		
		Arrays.sort(fileArray); 
		
		boolean result = false;
		
		int outcome = Arrays.binarySearch(fileArray, fileName); 
		
		try {
				Thread.sleep(2000);
		
				if(outcome>=0)
				{
					    File fileToBeDeleted = new File("D:/simplilearnprograms/Lockme_Application/Ganesh/"+fileName);
						
					    fileToBeDeleted.delete(); 
                       
					     result = true;
				}
		}
		catch(InterruptedException ie)
		{
			System.err.println("something went wrong...");
		}
		return result; 
	}
	
	public boolean searchFile(String fileName)
	{
		String[] fileArray = myfile.list(); 
		
		Arrays.sort(fileArray); 
		
		int outcome = Arrays.binarySearch(fileArray, fileName); 
		
		boolean result=false;
		
		try {
			
		     Thread.sleep(2000);
		      if(outcome>=0)
		      {
				
				result = true;
		      }

		}
		catch(InterruptedException ie)
		{
			System.err.println("oops something went wrong...");

		}
		return result; 
	}
	
	public void BackToMainMenu()
	{
		try {
			System.out.println(" Navigating to the main menu...\n");
			Thread.sleep(2000);
			return;
		}
		catch (InterruptedException e) {
			System.err.println("something went wrong !!");
			return;
		}
	}
	
	public void closeApplication()
	{
		try {
			System.out.println("Closing your Application....\n");
			Thread.sleep(2000);
			return;
		}
		catch (InterruptedException e)
		{
			System.err.println("something went wrong !!");
			return;
		}
		
	}
}
