package krishna;

public class RoboApp {

	public static void main(String[] args) {
		InheritanceWithoutFighter iwf = new InheritanceWithoutFighter();
		System.out.println("OutPut for Fighter Robot:");
		iwf.Speak();
		iwf.Interact();
		iwf.Learn();
		iwf.Recharg();
		iwf.Fight();
		
		
		//player robot
		System.out.println("OutPut for Player Robot:");
		PlayerRobot pr = new PlayerRobot();
		pr.Speak();
		pr.Interact();
		pr.Learn();
		pr.Recharg();
		pr.Play();
		
		
		//Teacher robot
		System.out.println("OutPut for Teacher Robot:");
		TeacherRobot tr = new TeacherRobot();
		tr.Speak();
		tr.Interact();
		tr.Learn();
		tr.Recharg();
		tr.Teach();
	
	}

}
