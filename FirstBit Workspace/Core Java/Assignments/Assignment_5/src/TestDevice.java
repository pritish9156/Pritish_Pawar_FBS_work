class Devices{
	int modelNo;
	String name;
	String brandName;
	int storage;
	int batteryCapacity;
	int currentBattery;
	String osType;
	
	public Devices() {
		// TODO Auto-generated constructor stub
		this.modelNo = 0;
		this.name = "Not given";
		this.brandName = "Not given";
		this.storage = 0;
		this.batteryCapacity = 0;
		this.currentBattery = 0;
		this.osType = "Not given";
	}

	Devices(int modelNo, String name, String brandName, int storage, int batteryCapacity, int currentBattery, String osType) {
		super();
		this.modelNo = modelNo;
		this.name = name;
		this.brandName = brandName;
		this.storage = storage;
		this.batteryCapacity = batteryCapacity;
		this.currentBattery = currentBattery;
		this.osType = osType;
	}



	int getModelNo() {
		return modelNo;
	}

	void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getBrandName() {
		return brandName;
	}

	void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	int getStorage() {
		return storage;
	}

	void setStorage(int storage) {
		this.storage = storage;
	}

	int getBatteryCapacity() {
		return batteryCapacity;
	}

	void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	int getCurrentBattery() {
		return currentBattery;
	}

	void setCurrentBattery(int currentBattery) {
		this.currentBattery = currentBattery;
	}
	
	String getOsType() {
		return osType;
	}
	
	void setOsType(String osType) {
		this.osType = osType;
	}

	void display() {
		System.out.println("Model Number: " + this.modelNo);
		System.out.println("Device Name: " + this.name);
		System.out.println("Brand Name: " + this.brandName);
		System.out.println("Storage: " + this.storage);
		System.out.println("Battery Capacity: " + this.batteryCapacity);
		System.out.println("Current Battery Status: " + this.currentBattery);
		System.out.println("Operating System type: " + this.osType);
	}
}// Devices class ends here

class Mobile extends Devices{
	String imeiNumber;
	int noOfSimSlots;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
		this.imeiNumber = "Not Present";
		this.noOfSimSlots = 0;
	}

	Mobile(int modelNo, String name, String brandName, int storage, int batteryCapacity, int currentBattery, String osType, String imeiNumber, int noOfSimSlots) {
		super(modelNo, name, brandName, storage, batteryCapacity, currentBattery, osType);
		this.imeiNumber = imeiNumber;
		this.noOfSimSlots = noOfSimSlots;
	}

	String getImeiNumber() {
		return imeiNumber;
	}

	void setImeiNumber(String imeiNumber) {
		this.imeiNumber = imeiNumber;
	}

	int getNoOfSimSlots() {
		return noOfSimSlots;
	}

	void setNoOfSimSlots(int noOfSimSlots) {
		this.noOfSimSlots = noOfSimSlots;
	}
	
	 void display() {
		 super.display();
		 System.out.println("IMEI Number: " + this.imeiNumber);
		 System.out.println("Number of SIM slots: " + this.noOfSimSlots);
	 }
	
}//Mobile class ends here

class SmartWatch extends Devices{
	boolean hasRotatingBezel;
	boolean hasHeartRateMonitor;
	boolean hasHpo2Monitor;
	
	public SmartWatch() {
		this.hasRotatingBezel = false;
		this.hasHeartRateMonitor = false;
		this.hasHpo2Monitor = false;
	}

	SmartWatch(int modelNo, String name, String brandName, int storage, int batteryCapacity, int currentBattery, String osType, boolean hasRotatingBezel, boolean hasHeartRateMonitor, boolean hasHpo2Monitor) {
		super(modelNo, name, brandName, storage, batteryCapacity, currentBattery, osType);
		this.hasRotatingBezel = hasRotatingBezel;
		this.hasHeartRateMonitor = hasHeartRateMonitor;
		this.hasHpo2Monitor = hasHpo2Monitor;
	}

	boolean isHasRotatingBezel() {
		return hasRotatingBezel;
	}

	void setHasRotatingBezel(boolean hasRotatingBezel) {
		this.hasRotatingBezel = hasRotatingBezel;
	}

	boolean isHasHeartRateMonitor() {
		return hasHeartRateMonitor;
	}

	void setHasHeartRateMonitor(boolean hasHeartRateMonitor) {
		this.hasHeartRateMonitor = hasHeartRateMonitor;
	}

	boolean isHasHpo2Monitor() {
		return hasHpo2Monitor;
	}

	void setHasHpo2Monitor(boolean hasHpo2Monitor) {
		this.hasHpo2Monitor = hasHpo2Monitor;
	}
	
	void display() {
		super.display();
		System.out.println("Rotating Bazel: " + this.hasRotatingBezel);
		System.out.println("Heart Rate Monitor: " + this.hasHeartRateMonitor);
		System.out.println("HPO2 Monitor: " + this.hasHpo2Monitor);
	}
	
}//smart watch class ends here

class Laptop extends Devices{
	boolean hasgraphicCard;
	String graphicsVersion;
	String graphicsBrand;
	String processorName;
	String processorBrand;
	String keyboardType;
	int noOfUsbPorts;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
		this.hasgraphicCard = false;
		this.graphicsVersion = "Not given";
		this.graphicsBrand = "Not given";
		this.processorBrand = "Not given";
		this.processorName = "Not given";
		this.keyboardType = "Not given";
		this.noOfUsbPorts = 0;
	}

	Laptop(int modelNo, String name, String brandName, int storage, int batteryCapacity, int currentBattery, String osType, boolean hasgraphicCard, String graphicsVersion, String graphicsBrand, String processorName,
			String processorBrand, String keyboardType, int noOfUsbPorts) 
	{
		
		super(modelNo, name, brandName, storage, batteryCapacity, currentBattery, osType);
		this.hasgraphicCard = hasgraphicCard;
		this.graphicsVersion = graphicsVersion;
		this.graphicsBrand = graphicsBrand;
		this.processorName = processorName;
		this.processorBrand = processorBrand;
		this.keyboardType = keyboardType;
		this.noOfUsbPorts = noOfUsbPorts;
	}

	boolean isHasgraphicCard() {
		return hasgraphicCard;
	}

	void setHasgraphicCard(boolean hasgraphicCard) {
		this.hasgraphicCard = hasgraphicCard;
	}

	String getGraphicsVersion() {
		return graphicsVersion;
	}

	void setGraphicsVersion(String graphicsVersion) {
		this.graphicsVersion = graphicsVersion;
	}

	String getGraphicsBrand() {
		return graphicsBrand;
	}

	void setGraphicsBrand(String graphicsBrand) {
		this.graphicsBrand = graphicsBrand;
	}

	String getProcessorName() {
		return processorName;
	}

	void setProcessorName(String processorName) {
		this.processorName = processorName;
	}

	String getProcessorBrand() {
		return processorBrand;
	}

	void setProcessorBrand(String processorBrand) {
		this.processorBrand = processorBrand;
	}

	String getKeyboardType() {
		return keyboardType;
	}

	void setKeyboardType(String keyboardType) {
		this.keyboardType = keyboardType;
	}

	int getNoOfUsbPorts() {
		return noOfUsbPorts;
	}

	void setNoOfUsbPorts(int noOfUsbPorts) {
		this.noOfUsbPorts = noOfUsbPorts;
	}
	
	void display() {
		super.display();
		System.out.println("Has Graphic Card: " + this.hasgraphicCard);
		System.out.println("Graphics Version: " + this.graphicsVersion);
		System.out.println("Graphics Brand: " + this.graphicsBrand);
		System.out.println("Processor Name: " + this.processorName);
		System.out.println("Processor Brand: " + this.processorBrand);
		System.out.println("Keyborad Type: " + this.keyboardType);
		System.out.println("Number of USB ports: " + this.noOfUsbPorts);
	}
	
	
}//class Laptop ends here

public class TestDevice {

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile(101, "Samsung S3", "Samsung", 124, 5000, 40, "Android", "SO1299", 2);
		SmartWatch sw1 = new SmartWatch(410, "Galaxy Watch 4 classic", "Samsung", 64, 800, 13, "WearOS", true, false, true);
		Laptop l1 = new Laptop(41003, "HP Pavilion", "HP", 1, 10000, 100, "Windows OS", true, "GTX 1650", "Nvidia", "Ryzen 5", "AMD", "Mechanical", 4);
		
		m1.display();
		System.out.println();
		sw1.display();
		System.out.println();
		l1.display();

	}

}
