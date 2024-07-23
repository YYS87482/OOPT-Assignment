public class TestCircle {
	public static void main(String[] args) {

		Circle c1 = new Circle();
		Circle c2 = new Circle(5);

		System.out.println("Radius = " + c1.getRadius() + "\n\t Area = " + c1.findArea());

		System.out.println("Radius = " + c2.getRadius() + "\n\t Area = " + c2.findArea());

	}
}

class Circle {
	private double radius;

	public Circle() {
		this(1.0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double findArea() {
		return Math.PI * radius * radius;
	}
}
