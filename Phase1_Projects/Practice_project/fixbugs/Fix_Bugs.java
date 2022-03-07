package fixbugs;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Fix_Bugs 
	{
	public static void main(String[] args)
	{
		OptionsSelection();
	}
	private static void OptionsSelection()
	{
		String[] arr = {"1. Review my expenditure",
						"2. Add my expenditure",
						"3. Delete my expenditure",
						"4. Sort the expenditure",
						"5. Search for a particular expenditure",
						"6. Close the expenditure"};
		int[] arr1 = {1,2,3,4,5,6};
		int slen = arr1.length;
		for(int i=0;i<slen;i++)
		{
			System.out.println(arr[i]);
		}
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		ArrayList<Integer> expenses = new ArrayList<Integer>();
		expenses.add(500);
		expenses.add(1500);
		expenses.add(3000);
		expenses.add(45000);
		expenses.addAll(arrlist);
		System.out.println("\n Enter your choice:\t");
		Scanner sc = new Scanner(System.in);
		int options = sc.nextInt();
		for(int j=1;j<=slen;j++)
		{
			if(options==j)
			{
				switch(options)
				{
				case 1:System.out.println("Your saved expenses are listed below:\n");
					   System.out.println(expenses + "\n");
					   OptionsSelection();
					   break;
				case 2:System.out.println("Enter the value to add your Expenses:\n");
					   int value = sc.nextInt();
					   expenses.add(value);
					   System.out.println("Your value is Update\n");
					   expenses.addAll(arrlist);
					   System.out.println(expenses + "\n");
					   OptionsSelection();
					   break;
				case 3:System.out.println("You are delete all your expenses! \nConfirm again by selecting the same option...\n");
					   int choice = sc.nextInt();
					   if(choice == options)
					   {
						expenses.clear();
						System.out.println(expenses + "\n");
						System.out.println("All your expenses are erased\n");
					   }
					  else 
					   {
						System.out.println("Try again!!");
					    }
					    OptionsSelection();
					    break;
				case 4:SortExpenses(expenses);
					   OptionsSelection();
					   break;
				case 5:SearchExpenses(expenses);
					   OptionsSelection();
					   break;
				case 6:closeApp();
					   break;
			  default:System.out.println("You made an invalid choice");
					  break;
					
				}
			}
		}
	}
	private static void closeApp() 
		{
		System.out.println("Close Your application..\n ");
		}
	private static void SearchExpenses(ArrayList<Integer> expenses)
		{
		int len = expenses.size();
		System.out.println("Enter the expense you need to search:\t");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i=0;i<len;i++)
		{
			if(expenses.get(i)==input) 
			{
				System.out.println("Found the expense" + input + "at" + i + "Postion");
			}
		}
		
		}
	private static void SortExpenses(ArrayList<Integer> expenses)
	{
		int arrlength = expenses.size();
		Collections.sort(expenses);
		System.out.println("Sorted expenses:");
		for(int i:expenses) {
			System.out.print(i+"");
		}
		System.out.print("\n");
		
	}
}



