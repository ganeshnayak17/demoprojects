package filehandling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		CreateFile cf = new CreateFile();
     while(true) 
      {
			System.out.println("\n1 To Write a File\n2 To Read a File\n3 To Append a File");
			int i = sc.nextInt();
			if(i==1)
			{
				cf.write();
			}
			else if(i==2)
			{
				cf.read();
			}
			else if(i==3)
			{
				cf.append();
			}
			else
			{
			    System.out.println("4 Exit");
				break;
			}
		
		}

	}
}

class CreateFile
{

	Scanner sc = new Scanner(System.in);
    void write()
	{

		System.out.println("Enter Your FileName");
		String wname = sc.nextLine();
		File file = new File(wname);

		try 
		{

			System.out.println(file.createNewFile());
			FileWriter write = new FileWriter(file);
			System.out.println("Enter Your Data");
			String k = sc.nextLine();
			write.write(k);
			write.flush();

		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
   
    void read()
    {
		Scanner sc = new Scanner(System.in);
		try
		{

			System.out.println("Enter a FileName");
			String fread = sc.nextLine();
			FileInputStream file = new FileInputStream(fread);

			BufferedInputStream input = new BufferedInputStream(file);

			int i = input.read();

			while (i != -1) 
			{
				System.out.print((char) i);

				i = input.read();
			}
			input.close();
		}

		catch (Exception e)
		{
			e.getStackTrace();
		}
	}

	void append()
	{
       Scanner sc = new Scanner(System.in);
		System.out.println("Enter a FileName");
		String fa = sc.nextLine();
		System.out.println("Enter Your Data");
		String text = sc.nextLine();
        try
		{
			FileWriter fw = new FileWriter(fa, true);
			fw.write(text);
			fw.close();
		} 
		catch (IOException e)
		{
		}
		}
	}
