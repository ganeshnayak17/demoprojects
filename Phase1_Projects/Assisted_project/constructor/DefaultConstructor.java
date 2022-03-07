package constructor;
class StudentInfo
{
	String name ="raju";
	int rollno = 7;
	public void showData()
	{
		System.out.println(name+" "+rollno);
	}
	
}
public class DefaultConstructor {

	public static void main(String[] args) 
	{
		StudentInfo s1 = new StudentInfo();
		s1.showData();

	}

}
