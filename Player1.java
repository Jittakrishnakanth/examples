package krishna;

public class Player1 {
	void Execise()
		{
			System.out.println("Execise to stay fit");
		}
	}
class Cricketer extends Player1
{
	void PlayCricket() {
		System.out.println("Playing Cricket for fun");
		
	}
}
class T20Cricketer extends Cricketer{
	void Attack() {
		System.out.println("Play in aggressive way");
	}
}
class TestCricketer extends T20Cricketer{
	void Defend() {
		System.out.println("Play in defensive way");
	}
}