package innerclass;

public class InnerClass 
{
		 private String emp="Vinay"; 
		 
		 class Inner
		 {  
		  void hello()
		  {
			  System.out.println(emp+" is a employee of a  MNC company");
		  }
		 }  


		public static void main(String[] args) 
		{

			InnerClass obj=new InnerClass();
			InnerClass.Inner in=obj.new Inner();  
			in.hello();  
		}
	


	}


