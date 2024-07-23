package krishna;

public class ShapeApp3 {

	public static void main(String[] args) {
		Square sq = new Square();
		Rectangle re = new Rectangle();
		Circle ci = new Circle();
		fun(sq);
		fun(re);
		fun(ci);
		}
	public static void fun(Shape3 s) {
		s.findArea();
		s.display();
		
	}



	}


