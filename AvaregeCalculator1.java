import java.util.Scanner;
class AvaregeCalculator1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int sum = a+b+c;
		double avg = sum/3.0;
		System.out.println("doublesum="+avg);
	}
}
