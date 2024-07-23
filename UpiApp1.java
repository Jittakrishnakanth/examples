package krishna;//Using try and catch
import java.util.Scanner;
public class UpiApp1{
	void Pay()
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
	}
		System.out.println("connection with bank ended");
		
}
}