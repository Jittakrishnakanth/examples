import java.util.Scanner;
class UserInput
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age:");
		byte age = scan.nextByte();
		System.out.println("Age="+age);
		System.out.println("Enter height:");
		float height = scan.nextFloat();
		System.out.println("Height="+height);
	}
}