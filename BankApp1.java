package krishna;
import java.util.Scanner;
class EBanking 
{
	void transcation()
	{
		System.out.println("Log in to account");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter amount:");
		int amt = scan.nextInt();
		System.out.println("Log out from account");
		}
	}
class BankApp1{
	public static void main(String []args) {
		EBanking e = new EBanking();
	}
	
}

