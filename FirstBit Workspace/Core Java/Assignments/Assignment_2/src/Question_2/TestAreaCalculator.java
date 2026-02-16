package Question_2;

class Shape{
	
	double area;
	
	double calculateArea(double base, double height) {
		this.area = 0.5 * base * height;
		return this.area;
		
	}
	
	double calculateArea(double length, double breadth, boolean isTriangle) {
		this.area = length * breadth;
		return this.area;
	}
	
	double calculateArea(double radius) {
		this.area = 3.14 * radius * radius;
		return this.area;
	}
}

class Triangle{
	
	double base, height;
	
	public Triangle() {
		this.base = 10.5;
		this.height = 4.5;
	}

	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}
	
}

class Rectangle{
	
	double length; 
	double breadth;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		this.length = 5;
		this.breadth = 5;
	}

	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getBreadth() {
		return breadth;
	}

	void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
}

class Circle{
	
	double radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
		this.radius = 5.2;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
}


public class TestAreaCalculator {

	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		Triangle t1 = new Triangle();
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();
		
		System.out.println("Area of Triangle: " + s1.calculateArea(t1.getBase(), t1.getHeight()));
		System.out.println("Area of Rectangle: " + s1.calculateArea(r1.getLength(), r1.getBreadth(), true));
		System.out.printf("Area of Circle: %.2f",s1.calculateArea(c1.getRadius()));
		
	}

}
