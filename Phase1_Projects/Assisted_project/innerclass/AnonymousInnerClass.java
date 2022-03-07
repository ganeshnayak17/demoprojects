package innerclass;
abstract class AnonymousClass
{			   
	public abstract void display();
}
public class AnonymousInnerClass 
{
  public static void main(String[] args)
  {
	AnonymousClass i = new AnonymousClass()
	{
   public void display()
   {
	 System.out.println("Anonymous Inner Class");
  }
  };
  i.display();
}
}



