package accessmodifier;

class Modifier1
{
	void display()
{
   System.out.println("This is a Default modifier");
}
}
public class DefaultAccessModifier 
{

	public static void main(String[] args)
	{
		Modifier1 m = new Modifier1();
		m.display();	

	}

}
