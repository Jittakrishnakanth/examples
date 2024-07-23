package krishna;
import java.util.Scanner;
class FBanking 
{
	void transaction()
	{
		System.out.println("Log in to account");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter amount:");
		int amt = scan.nextInt();
		System.out.println("Log out from account");
		}
	}
class BankApp2{
	public static void main(String []args) {
		
		FBanking f = new FBanking();
		f.transaction();
	}
	
}
