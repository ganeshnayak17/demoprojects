package OopsConceptDemo;

class Circle 
{
	public int r;
	public static double pi=3.14;
	public void printArea()
	{
		System.out.println("area of circle");
		System.out.println(pi*r*r);
	}
}
class ClassAndObject
{
	public static void main(String[] args) 
	{
		Circle c1=new Circle();
		Circle c2=new Circle();
		Circle c3=new Circle();
		c1.r=7;
		c2.r=10;
		c3.r=12;
		c1.printArea();
		c2.printArea();
		c3.printArea();
	}
}

