package constructor;
class Employee
{
	public void emp(String name,int id)
	{
		System.out.println(name+" "+id);
	}
}
public class ParameterizedConstructor
{

	public static void main(String[] args)
	{
		Employee e1= new Employee();
		Employee e2= new Employee();
		e1.emp("raja",12);
		e2.emp("pavan",23);

	}

}
