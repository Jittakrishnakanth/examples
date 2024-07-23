package krishna;
import java.util.Scanner;
	class GBanking 
	{
		void transcation()
		{
			System.out.println("Log in to account");
			try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter amount:");
			int amt = scan.nextInt();
			System.out.println("Log out from account");
			}
			catch(Exception g) {
			System.out.println("Exception Handled");
	            g.printStackTrace();
			}
			System.out.println("Log out from account");
		}
	}
