package methods;
 public class MethodProgram
 {
	 int a,b;
	 public int callMethod(int b)
	 {
		 a=b*12;
		 return a;
	  }
  public static void main(String[] args)
  {
	  MethodProgram c1= new MethodProgram();
	  c1.callMethod(9);
	  System.out.println("new value of a is : "+c1.a);
  }
 }
