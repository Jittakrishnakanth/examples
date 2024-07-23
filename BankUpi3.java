package krishna;

public class BankUpi3{

	public static void main(String[] args) {
		try {
		UpiApp3 u = new UpiApp3();
		u.Pay();
		}
		catch(Exception u) {
			System.out.println("Exception info received by bank");
		}
}
}
