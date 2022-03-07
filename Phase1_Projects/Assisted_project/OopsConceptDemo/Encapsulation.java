package OopsConceptDemo;

class Calender
{
   private int monthNumber;
   public void provideMonthNumber(int monthNumber)
   {
	   if(monthNumber >= 1 && monthNumber<=12) 
	   {
		   this.monthNumber = monthNumber;
		   System.out.println("Given month number is valid");
		   System.out.println("Month number is assigned succesfully"); 
	   }
	   else
	   {
		   System.out.println("Invalid month number");
	   }
	  
   }
}
public class Encapsulation
{
	public static void main(String [] args)
	{
		Calender c1 = new Calender();
		c1.provideMonthNumber(10);
	}
}