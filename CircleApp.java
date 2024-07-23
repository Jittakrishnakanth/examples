package krishna;

public class CircleApp {

	public static void main(String[] args) {
		Circle c1 = new Circle(5.5);
		c1.findArea();
		Circle c2 = new Circle (15.5);
		c2.findArea();
		Circle c3 = new Circle (25.5);
		c3.findArea();

	}

}
class Circle{
	double radius;
	static double pi = 3.14;
	public Circle(double radius) {
		this.radius  = radius;
	}
	public void findArea() {
		double area = pi*radius*radius;
		System.out.println("Area of circle="+area);
	}
}