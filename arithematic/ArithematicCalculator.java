package arithematic;
import java.util.Scanner;
public class ArithematicCalculator 
{
		public static void main(String[] args)
		{
		    Scanner sc= new Scanner(System.in);
		    System.out.println("Enter your choice");
		    System.out.println("1.Addition");
		    System.out.println("2.Subtraction");
		    System.out.println("3.Multiplication");
		    System.out.println("4.Division");
		    int choice =sc.nextInt();
		    int n1,n2,result;
			switch(choice)
			{
			    case 1: System.out.println("Enter any two number to add");
			            n1 =sc.nextInt();
			            n2 =sc.nextInt();
			            result=n1+n2;
			            System.out.println("Addition of "+n1+ " and "+n2+ " is : "+result);
			            break;
			    case 2: System.out.println("Enter any two number to subtract");
			            n1 =sc.nextInt();
			            n2 =sc.nextInt();
			            result=n1-n2;
			            System.out.println("Subtraction of "+n1+" and "+n2+" is : "+result);
			            break;  
			    case 3: System.out.println("Enter any two number to multiply");
			            n1 =sc.nextInt();
			            n2 =sc.nextInt();
			            result=n1*n2;
			            System.out.println("Multiplication of "+n1+" and "+n2+" is : "+result);
			            break;      
			    case 4: System.out.println("Enter any two number to divide");
			            n1 =sc.nextInt();
			            n2 =sc.nextInt();
			            result=n1/n2;
			            System.out.println("Division of "+n1+" and "+n2+" is : "+result);
			            break;  
			    default:System.out.println("You have entered invalid choice");
			            break;
			}
		}
	}



