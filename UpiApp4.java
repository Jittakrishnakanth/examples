package krishna;//Using throws
import java.util.Scanner;
public class UpiApp4{
	void pay()throws Exception{
	{
		System.out.println("Connection Established with bank");
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter amount:");
		int amt = scan.nextInt();
		System.out.println(+amt);
		}
		catch(Exception u) {
		System.out.println("Exception handled by UpiApp");
		throw u;
	}
		finally {
			System.out.println("connection with bank ended");
		}
		
		
}
}
}
