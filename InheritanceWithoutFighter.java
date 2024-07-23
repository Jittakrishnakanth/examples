package krishna;

public class InheritanceWithoutFighter {
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
	void Fight(){
		System.out.println("Robot is Fighting");
}
}
class PlayerRobot{
	void Speak(){
		System.out.println("Robot is Fighting");
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
	void Play(){
		System.out.println("Robot is Playing");
}
}
class TeacherRobot{
	void Speak(){
		System.out.println("Robot is Fighting");
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
	void Teach(){
		System.out.println("Robot is Teaching");
}
}
