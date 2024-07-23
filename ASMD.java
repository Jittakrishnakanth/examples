import java.util.Scanner;
class ASMD
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Numbers:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a+b;
		System.out.println("Add Two Numbers="+c);
		 c = a-b;
		System.out.println("Sub Two Numbers="+c);
		 c = a*b;
		System.out.println("Mul Two Numbers="+c);
		 c =  a/b;
		System.out.println("Div Two Numbers="+c);
	}
}
