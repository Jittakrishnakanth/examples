package krishna;

public class BankUpi2{

	public static void main(String[] args) {
		try {
		UpiApp2 u = new UpiApp2();
		u.Pay();
		}
		catch(Exception u) {
			System.out.println("Exception info received by bank");
		}
}
}