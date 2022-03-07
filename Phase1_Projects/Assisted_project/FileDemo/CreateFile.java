package FileDemo;

import java.io.File;
import java.io.IOException;

public class CreateFile
{
	public static void main(String[] args)
	{
		File file = new File("D:\\abc.txt");
		try
		{
			if(file.createNewFile())
			{
				System.out.println("File got created");
			}
			else
			{
				System.out.println("File not created");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}