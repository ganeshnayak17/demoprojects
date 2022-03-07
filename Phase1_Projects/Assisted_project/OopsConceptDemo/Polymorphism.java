package OopsConceptDemo;

public class Polymorphism
{

	
		    public int sum(int m, int n) 
		    { 
		        return (m + n); 
		    } 
		    public int sum(int m, int n, int l) 
		    { 
		        return (m + n + l); 
		    } 
		    public double sum(double m, double n) 
		    { 
		        return (m + n); 
		    } 
		    public static void main(String args[]) 
		    { 
		        Polymorphism p1 = new Polymorphism(); 
		        System.out.println(p1.sum(167, 120)); 
		        System.out.println(p1.sum(130, 250, 630)); 
		        System.out.println(p1.sum(10.5, 20.5)); 
		    } 
		}
	


	


