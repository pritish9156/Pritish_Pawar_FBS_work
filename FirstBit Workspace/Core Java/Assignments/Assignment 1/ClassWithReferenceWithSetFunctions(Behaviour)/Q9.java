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