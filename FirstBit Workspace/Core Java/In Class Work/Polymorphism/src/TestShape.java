class Shape{
	double area;
	
	public Shape() {
		// TODO Auto-generated constructor stub
		this.area = 0;
	}

	Shape(double area) {
		this.area = area;
	}

	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}
	
	double calArea() {
		return this.area;
	}
	
	void display() {
		System.out.printf("area: %.2fcm", this.area);
		System.out.println();
	}
	
}//class shape ends here

class Circle extends Shape{
	double radius;
	
	public Circle() {
		super();
		this.radius = 0;
	}

	Circle(double radius) {
		this.radius = radius;	
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double calArea() {
		this.area = Math.PI*radius*radius;
		return this.area;
	}
	
	void display() {
		System.out.println("Area of Circle: ");
		System.out.println("Radius of Circle: " + this.radius);
		super.display();
	}
}//circle class ends here

class Triangle extends Shape{
	double base;
	double height;
	
	public Triangle() {
		// TODO Auto-generated constructor stub
		super();
		this.base = 0;
		this.height = 0;
	}

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
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
	
	double calArea() {
		this.area = 1/2f * base * height;
		return this.area;
	}
	
	void display() {
		System.out.println("Area of Triangle:");
		System.out.println("Base of Triangle: " + this.base);
		System.out.println("Height of Triangle: " + this.height);
		super.display();
	}
}//triangle class ends here

class Rectangle extends Shape{
	double length;
	double breadth;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		this.length = 0;
		this.breadth = 0;
	}

	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
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
	
	double calArea() {
		this.area = length*breadth;
		return this.area;
	}
	
	void display() {
		System.out.println("Area of Rectangle:");
		System.out.println("Length of Rectangle: " + this.length);
		System.out.println("Breadth of Rectangle: " + this.breadth);
		super.display();
	}
	
}//rectangle class ends here


public class TestShape {

	public static void main(String[] args) {
		
		Shape s1;
		s1 = new Circle(4);
		s1.calArea();
		s1.display();
		System.out.println();
		
		s1 = new Triangle(4, 2);
		s1.calArea();
		s1.display();
		System.out.println();
		
		s1 = new Rectangle(4, 2);
		s1.calArea();
		s1.display();
		System.out.println();

	}

}
