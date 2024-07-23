package krishna;

public class Hero2 {

	public static void main(String[] args) {
		Bank2 b = new Bank2();
		int p = 1234;
		b.SetAmt(p,50000);
		int a = b.getAmt(p);
		System.out.println("Amount ="+a);

	}

}
