

class Shape{
	
	double area;
	
	double calculateArea(Triangle t) {
		this.area = 0.5 * t.base * t.height;
		return this.area;
		
	}
	
	double calculateArea(Rectangle r) {
		this.area = r.length * r.breadth;
		return this.area;
	}
	
	double calculateArea(Circle c) {
		this.area = Math.PI * c.radius * c.radius;
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
		
		System.out.println("Area of triangle: " + s1.calculateArea(t1));
		System.out.println("Area of rectangle: " + s1.calculateArea(r1));
		System.out.printf("Area of circle: %.2f",s1.calculateArea(c1));
		
	}

}
