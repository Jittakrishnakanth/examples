package krishna;

public class Bank2 {
	private int amt = 100000;
	int pin = 1234;
	public void SetAmt(int a,int p) {
		if(pin==p) {
			amt = a;
		}
		else
		{
			System.out.println("Invalid pin");
			System.exit(0);
		}
	}
	public int getAmt(int p) {
		if(pin!=p) {
			System.out.println("Invalid pin");
			System.exit(0);
			
		}
		return amt;
	}
}



