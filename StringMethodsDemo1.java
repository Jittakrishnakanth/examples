package krishna;

public class StringMethodsDemo1 {

	public static void main(String[] args) {
		String str = "Krishna Tech Pvt Ltd";
		int l = str.length();
		boolean pr = str.contains("T");
		char ch[] = str.toCharArray();
		String s[] = str.split(" ");
		String str2 = str.concat("Softwares");
		System.out.println("Original String="+str);
		System.out.println("Length of string:"+l);
		System.out.println("Is given character present:"+pr);
		System.out.println("Printing Elements of array ch:");
		for(int i=0;i<=ch.length-1;i++)
		System.out.println(ch[i]);
		System.out.println("Printing Elements of array s:");
		for(int i=0;i<=s.length;i++)
		System.out.println(s[i]);
		System.out.println("Concated String:"+str2);
}

}
