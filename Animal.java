package krishna;

public class Animal {
	void move() {
		System.out.println("keep moving");
	}
	void sleep() {
		System.out.println("Sleep to relax");
	}
}
class Cornivores extends Animal
{
	void hunt() {
		System.out.println("Hunt an eat");
	}
}
class Tiger extends Cornivores
{
	
}