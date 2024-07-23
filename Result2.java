import java.util.Scanner;
public class Result2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter Size of arrey:");
		int a = sc.nextInt();
		int marks = new marks[a];
		System.out.println("please Enter marks of students:");
		for(i=0;i<marks.length;i++)
		marks[i] = sc.nextInt();
		}
	System.out.println("marks of students:");
	for(i=0;i<marks.length;i++)
	System.out.println(marks[i]);
}
