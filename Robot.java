package krishna;

public class Robot {
	void Speak(){
		System.out.println("Robot is Speakin");
	}
	void Interact(){
		System.out.println("Robot is Interacting");
	}
	void Learn(){
		System.out.println("Robot is Learing");
	}
	void Recharg(){
		System.out.println("Robot is Recharging");
	}

}
class FighterRobot extends Robot{
	void Fight(){
		System.out.println("Robot is Fighting");
}
}
class Player extends Robot{
	void Play(){
		System.out.println("Robot is Playing");
}
}
class Teacher extends Robot{
	void Teach(){
		System.out.println("Robot is teaching");
}
}