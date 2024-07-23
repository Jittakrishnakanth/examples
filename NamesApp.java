import java.util.Scanner;
public class NamesApp
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter number of classes:");
		int row = sc.nextInt();
		System.out.println("please Enter in Each class:");
		int col = sc.nextInt();
		sc.nextLine();
		String names[][] = new String[row][col];
		System.out.println("Names of Students:");
		for(int i=0;i<names.length;i++)
		for(int j=0;j<names[i].length;j++){
		System.out.println(names[i][j]+" ");
	}
	System.out.println();
	}
}

	