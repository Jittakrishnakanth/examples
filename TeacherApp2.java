class Teacher /* using constructor*/
{
	String name;
	String sub;
	int sal;
		void teach()
	{
		System.out.println("A teacher is teaches");
	}
	Teacher(String name,String sub,int sal)
	{
		this.name = name;
		this.sub = sub;
		this.sal = sal;
	}
}
class TeacherApp2
{
	public static void main(String[] args)
	{
	Teacher t1 = new Teacher("krishna","Java",35000);
	Teacher t2 = new Teacher("mani","Python",40000);
	System.out.println("Details of Teacher1 :");
	System.out.println("Teacher Name :"+t1.name);
	System.out.println("Teacher Teached sub :"+t1.sub);
	System.out.println("Teacher Sal :"+t1.sal);
	t1.teach();
	System.out.println("Details of Teacher1 :");
	System.out.println("Teacher Name :"+ t2.name);
	System.out.println("Teacher Teached sub :"+t2.sub);
	System.out.println("Teacher Sal :"+t2.sal);
	t2.teach();

	}
}