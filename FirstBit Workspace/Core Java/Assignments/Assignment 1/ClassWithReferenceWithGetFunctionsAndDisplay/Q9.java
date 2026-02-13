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

class Test9{

	public static void main(String args[]){
		
		Watch sw1 = new Watch(); //reference

		//HashCode
		System.out.println("\nHashCode: " + sw1);

		sw1.setSeries("SM R-890");
		sw1.setBrand("Samsung");
		sw1.setType("Smart Watch");
		sw1.setColour("Black");
		sw1.setConnectivityType("Bluetooth");
		sw1.setOs("Wear OS");
		sw1.setWattage(220);
		sw1.setBatteryLife(40);

		//displaying information
		System.out.println("\nSeries: " + sw1.getSeries());
		System.out.println("Brand: " + sw1.getBrand());
		System.out.println("Type: " + sw1.getType());
		System.out.println("Color: " + sw1.getColour());
		System.out.println("Connectivity Type: " + sw1.getConnectivityType());
		System.out.println("Operating System: " + sw1.getOs());
		System.out.println("Wattage: " + sw1.getWattage() + " Watts");
		System.out.println("Battery Life: " + sw1.getBatteryLife() + " Hours");

		System.out.println("using display function");

		sw1.display();
		
	}//main ends here

}