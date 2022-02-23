package accessmodifier;

class Modifier2
{
	private int j=10;
	private void display()
	{
		System.out.println("This is a private modifier");
	}
	public void showData()
	{
		System.out.println("value of j : "+j);
		this.display();
	}
	
}
public class PrivateAccessModifier
{

	public static void main(String[] args) 
	{
		Modifier2 m2 = new Modifier2();
		m2.showData();
	
	}

}
