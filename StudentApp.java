package krishna;

public class StudentApp {
public static void main(String[] args) {
		Student s1 = new Student("Deep","Engineering");
		s1.giveIntroducation();
		s1.breathe();
		Student s2 = new Student("Aman","MCA");
		s2.giveIntroducation();
		s2.breathe();

	}
}
class Student{
	String name,degree;
	public Student(String name,String degree) {
		this.name = name;
		this .degree = degree;
	}
	public void giveIntroducation() {
		//System.out.println("My name is",+name);
		//System.out.println("I graduated in ",+degree);
	}
	public static void breathe() {
		System.out.println("Inhale Oxygen & exhale carbon-di-oxide");
	}
}
