package krishna;

public class RobotApp {

	public static void main(String[] args) {
		FighterRobot fr = new FighterRobot();
		System.out.println("OutPut for Fighter Robot:");
		fr.Speak();
		fr.Interact();
		fr.Learn();
		fr.Recharg();
		fr.Fight();
		//PlayerRobot
		System.out.println("OutPut for Player Robot:");
		PlayerRobot pr = new PlayerRobot();
		pr.Speak();
		pr.Interact();
		pr.Learn();
		pr.Recharg();
		pr.Play();
		//TeacherRobot
		System.out.println("OutPut for Teacher Robot:");
		TeacherRobot tr = new TeacherRobot();
		tr.Speak();
		tr.Interact();
		tr.Learn();
		tr.Recharg();
		tr.Teach();

	}

}
