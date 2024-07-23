class Teacher 
{
	String name;
	String sub;
	int sal;
		void teach()
	{
		System.out.println("A teacher is teaches");
	}
}
class TeacherApp
{
public static void main(String[] args) 
	{
	Teacher t1 = new Teacher();
	t1.name = "krishna";
	t1.sub = "Maths";
	t1.sal = 40000;
	System.out.println("Details of Teacher1 :");
	System.out.println("Teacher Name :"+t1.name);
	System.out.println("Teacher Teached sub :"+t1.sub);
	System.out.println("Teacher Sal :"+t1.sal);
	t1.teach();
	Teacher t2 = new Teacher();
	t2.name = "Mani";
	t2.sub = "social";
	t2.sal = 35000;
	System.out.println("Details of Teacher1 :");
	System.out.println("Teacher Name :"+t2.name);
	System.out.println("Teacher Teached sub :"+t2.sub);
	System.out.println("Teacher Sal :"+t2.sal);
	t2.teach();

	}
}
