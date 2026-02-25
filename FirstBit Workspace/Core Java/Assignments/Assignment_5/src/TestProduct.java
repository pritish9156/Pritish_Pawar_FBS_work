class Product{
	String productName;
	double price;
	String category;
	int quantity;
	String brand;
	
	public Product() {
		this.productName = "Not Given";
		this.price = 0;
		this.category = "Not Given";
		this.quantity = 0;
		this.brand = "Not Given";
	}

	Product(String productName, double price, String category, int quantity, String brand) {
		this.productName = productName;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.brand = brand;
	}

	void display() {
		System.out.println("Product Name: " + this.productName);
		System.out.println("Price: " + this.price);
		System.out.println("Category: " + this.category);
		System.out.println("Quantity: " + this.quantity);
		System.out.println("Brand: " + this.brand);
	}
}

class Electronics extends Product{
	int warranty;
	String powerConsumption;
	
	public Electronics() {
		super();
		this.warranty = 0;
		this.powerConsumption = "Not Given";
	}

	Electronics(String productName, double price, String category, int quantity, String brand, int warranty, String powerConsumption) {
		super(productName, price, category, quantity, brand);
		this.warranty = warranty;
		this.powerConsumption = powerConsumption;
	}

	void display() {
		super.display();
		System.out.println("Warranty: " + this.warranty);
		System.out.println("Power Consumption: " + this.powerConsumption);
	}
}

class Clothing extends Product{
	String size;
	String fabric;
	
	public Clothing() {
		super();
		this.size = "Not Given";
		this.fabric = "Not Given";
	}

	Clothing(String productName, double price, String category, int quantity, String brand, String size, String fabric) {
		super(productName, price, category, quantity, brand);
		this.size = size;
		this.fabric = fabric;
	}

	void display() {
		super.display();
		System.out.println("Size: " + this.size);
		System.out.println("Fabric: " + this.fabric);
	}
}

public class TestProduct{
	public static void main(String[] args) {
		
		Electronics e1 = new Electronics("Laptop", 60000, "Gadgets", 5, "HP", 2, "65W");
		Clothing c1 = new Clothing("T-Shirt", 999, "Wearable", 20, "Puma", "L", "Cotton");
		
		e1.display();
		System.out.println();
		c1.display();
	}
}