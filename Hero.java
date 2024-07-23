package krishna;//Encapsulation
class Bank {
	int amt = 10000;
}

public class Hero {

	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println("Amount="+b.amt);

	}

}
class Villain{
	public static void main(String [] args) {
	Bank b = new Bank();
	System.out.println("Amount="+b.amt);
}
}
