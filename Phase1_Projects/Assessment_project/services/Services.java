package services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public interface Services 
{
	
	 File  myfile = new File("D:/simplilearnprograms/Lockme_Application/Ganesh");

	List<String> retrieveFilesInAscendingOrder();
	
	boolean addFile(String fileName);
	
	boolean deleteFile(String fileName);
	
	boolean searchFile(String fileName);
	
	void BackToMainMenu();
	
	void closeApplication();

}

