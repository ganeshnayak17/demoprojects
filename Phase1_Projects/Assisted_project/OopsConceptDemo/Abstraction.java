package OopsConceptDemo;

abstract class Cycle 
{
	 abstract void work();
	}

	class Abstraction extends Cycle
	{
	 void work() 
	 {
	  System.out.println("Selling good");
	 }
	 
	 public static void main(String args[])
	 {
	  Cycle o = new Abstraction();
	  o.work();
	  System.out.println("Code executed");
	 }
	 
	}