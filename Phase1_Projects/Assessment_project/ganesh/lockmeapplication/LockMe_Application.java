package ganesh.lockmeapplication;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import services.*;

public class LockMe_Application 
{
    public static void main(String[] args) 
    {
		Services myService = new MyServices(); 
		System.out.println("****Welcome to virtual key locker application main page by Ganesh Nayak****\n");  
		first:while(true)
		{
			Scanner sc = new Scanner(System.in); 
		             
                 System.out.println("Choose anyone option listed below: \n");
			     System.out.println(" 1. Retrive file names in ascending order");
				 System.out.println(" 2. Perform various business level operations on files\n\t A. Add a user specific file\n\t B. Delete a user specific file\n\t C. Search a user specific file\n\t D. Back to main menu");
				 System.out.println(" 3. Exit/close the application\n");
				 System.out.println("---------------------------------------------------");
				 System.out.print("Enter your choice : ");
				 int mainChoice = 0;
				 try 
				 {
					  mainChoice = sc.nextInt(); 
				  }
				   catch(InputMismatchException i)
					  {
						  System.err.println("Please enter an integer value !!");
						  continue first;
					  }
			          sc.nextLine();
		              System.out.println();
			          switch(mainChoice)
			          {
			          	 
			          	 case 1: List<String> listOfFiles = myService.retrieveFilesInAscendingOrder(); 
			          		     
			          		     if(! listOfFiles.isEmpty())
			          		     {
			          		    	 System.out.println("***Your Files are listed below in ascending order***");
			          		    	 for(String fileNames:listOfFiles)
			          		    		 System.out.println(fileNames);
			          		    	 System.out.println();
			          		     }
			          		     else
			          		    	 System.err.println("Sorry, there are no files in the directory currently !!\n");
			          		     break;
			          	 case 2: second:while(true)
			          		    {
			          		    	System.out.println("***You have the following options***");
			 	          		    System.out.print("\t A. Add a specific file\n\t "
			 	          		    		           + "B. Delete a specific file\n\t"
			 	          		    		           + " C. Search a specific file\n\t "
			 	          		    		           + "D. Navigate back to main menu\n");
			 	          		    System.out.print("Now Enter you choice : ");
			 	          		    String subChoice = sc.nextLine().toLowerCase();
				          		    switch(subChoice)
				          		    {
				          		       case "a" :System.out.print("Enter file Name you want to add : ");
				          		    	         String fileName = sc.nextLine(); 
				          		    	         boolean result = myService.addFile(fileName); 
				          		    	         if(! result)
				          		    	         {
				          		    	        	 System.err.println("File already exists!!\n");
				          		    	        	 break second;
				          		    	         }
				          		    	         System.out.println("File added successfully...\n");
				          		    	         break second;
				          		       case "b" :System.out.print("Enter file name you want to delete : ");
				          		    	         fileName = sc.nextLine(); 
				          		    	         result = myService.deleteFile(fileName); 
				          		    	         
				          		    	         if(!result)
				          		    	         {
				          		    	        	 System.err.println("File Not Found !!\n");
				          		    	         }
				          		    	         else
				          		    	         {
				          		    	        	 System.out.println("Your file has been deleted successfully\n");
				          		    	         System.out.println();
				          		    	         }
				          		    	         break second;
				          		       case "c":System.out.print("Enter file you want to search : ");
				          		    	        fileName = sc.nextLine(); 
				          		    	        boolean isAvailable = myService.searchFile(fileName); 
				          		    	        
				          		    	        if(isAvailable) 
				          		    	        {
				          		    	        	System.out.println("Your file is available\n");
				          		    	        }
				          		    	        else
				          		    	        {	
				          		    	        System.err.println("Sorry Your file is not available !!\n ");		
				          		    	        }
				          		    	        break second;
				          		       case "d": myService.BackToMainMenu(); 
				          		    	         continue first;
						          	   default : 
						          		       System.err.println("Please enter a valid  choice !! \n");
				          		    }
			          		    }
			          		    break;
			          
			          	 case 3: myService.closeApplication(); 
			          		   break first;
			            
			             default : System.err.println("Please enter a valid choice !! \n");
			            	       continue first;
			          }
				}	
				System.out.println("**Thank You for using My Application**");

			}

}


	


