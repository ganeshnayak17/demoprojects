package methods;

public class MethodOverloading
{
 public void area(int a)
 {
	 System.out.println("Area of square is : "+a*a);
 }
 public void area(int l,int b,int h)
 {
	 System.out.println("Arae of rectangle is : "+l*b*h);
 }
	public static void main(String[] args) 
	{
	   MethodOverloading m1 = new MethodOverloading();
	   m1.area(5);
	   m1.area(4,6,9);

	}

}
