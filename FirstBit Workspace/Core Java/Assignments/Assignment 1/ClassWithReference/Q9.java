class Watch{

	//Attributes

	String series;
	String brand;
	String type;
	String colour;
	String connectivityType;
	String os;
	int wattage;
	int batteryLife;
	
}//Watch class ends here

class Test9{

	public static void main(String args[]){
		
		Watch sw1 = new Watch(); //reference

		//HashCode
		System.out.println("\nHashCode: " + sw1);

		//initialization
		sw1.series = "SM R-890";
		sw1.brand = "Samsung";
		sw1.type = "Smart Watch";
		sw1.colour = "Black";
		sw1.connectivityType = "Bluetooth";
		sw1.os = "Wear OS";
		sw1.wattage = 220;
		sw1.batteryLife = 40;

		//displaying information
		System.out.println("\nSeries: " + sw1.series);
		System.out.println("Brand: " + sw1.brand);
		System.out.println("Type: " + sw1.type);
		System.out.println("Color: " + sw1.colour);
		System.out.println("Connectivity Type: " + sw1.connectivityType);
		System.out.println("Operating System: " + sw1.os);
		System.out.println("Wattage: " + sw1.wattage + " Watts");
		System.out.println("Battery Life: " + sw1.batteryLife + " Hours");
		
	}//main ends here

}