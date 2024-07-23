package krishna;
public interface InterfaceExample {
	public static final int x = 10;
	int y = 20;
	public abstract void fun1();
	public abstract void fun2();
	public abstract void fun3();
public default void fun4()
{
 System.out.println("This is default method");
}
public static void main(String[] args) {
	System.out.println("This is static Block");
}
}


/*
public Abstract  ClassExample(){
	System.out.println("this is Constructor");
	}
static {
	System.out.println("This is static Block");
}
public static void main(String[] args) {
	System.out.println("This is static Block");
	
}*/

