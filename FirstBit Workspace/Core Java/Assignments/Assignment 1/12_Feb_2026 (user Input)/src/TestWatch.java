import java.util.Scanner;

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

	//constructors
	//default

	Watch(){
		this.series = "data not avilable";
	 	this.brand = "data not avilable";
	 	this.type = "data not avilable";
		this.colour = "data not avilable";
		this.connectivityType = "data not avilable";
		this.os = "data not avilable";
	}

	//parametarised

	Watch(String s, String b, String t, String c, String ct, String o, int w, int bl){
		this.series = s;
	 	this.brand = b;
	 	this.type = t;
		this.colour = c;
		this.connectivityType = ct;
		this.os = o;
		this.wattage = w;
		this.batteryLife = bl;
	}
	
	void setSeries(String i){
		this.series = i;
	}

	void setBrand(String name){
		this.brand = name;
	}

	void setType(String t){
		this.type = t;
	}

	void setColour(String col){
		this.colour = col;
	}

	void setConnectivityType(String c){
		this.connectivityType = c;
	}

	void setOs(String o){
		this.os = o;
	}

	void setWattage(int w){
		this.wattage = w;
	}

	void setBatteryLife(int bl){
		this.batteryLife = bl;
	}

	//getters

	String getSeries(){
		return this.series;
	}

	String getBrand(){
		return this.brand;
	}

	String getType(){
		return this.type;
	}

	String getColour(){
		return this.colour;
	}

	String getConnectivityType(){
		return this.connectivityType;
	}

	String getOs(){
		return this.os;
	}

	int getWattage(){
		return this.wattage;
	}

	int getBatteryLife(){
		return this.batteryLife;
	}

	//display
	void display(){
		System.out.println("\nSeries: " + series);
		System.out.println("Brand: " + brand);
		System.out.println("Type: " + type);
		System.out.println("Color: " + colour);
		System.out.println("Connectivity Type: " + connectivityType);
		System.out.println("Operating System: " + os);
		System.out.println("Wattage: " + wattage + " Watts");
		System.out.println("Battery Life: " + batteryLife + " Hours");
	}

}//Watch class ends here

class TestWatch{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter series: ");
		String series = sc.nextLine();
		
		System.out.println("Enter brand Name: ");
		String name = sc.nextLine();
		
		System.out.println("Watch Type: ");
		String type = sc.nextLine();
		
		System.out.println("Enter Colour: ");
		String color = sc.nextLine();
		
		System.out.println("Enter connectivityType: ");
		String connecType = sc.nextLine();
		
		System.out.println("Watch OS: ");
		String os = sc.nextLine();
		
		System.out.println("Enter Wattage: ");
		int watt = sc.nextInt();
		
		System.out.println("Enter Battery Life: ");
		int battLife = sc.nextInt();
		
		Watch sw1 = new Watch(series, name, type, color, connecType, os, watt, battLife);
		
		sw1.display();

		sc.close();
		
	}//main ends here

}