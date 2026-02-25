class Vehicle{
	String vehicleNumber;
	String model;
	String companyName;
	int noOfWheels;
	double price;
	
	Vehicle(){
		this.vehicleNumber = "0";
		this.model = "Not Given";
		this.companyName = "Not Given";
		this.noOfWheels = 0;
		this.price = 0;
	}

	Vehicle(String vehicleNumber, String model, String companyName, int noOfWheels, double price) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.price = price;
	}

	String getVehicleNumber() {
		return vehicleNumber;
	}

	void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	int getNoOfWheels() {
		return noOfWheels;
	}

	void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}
	
	void applyBreak() {
		System.out.println("All vehicles stop !");
	}
	
	void display() {
		System.out.println("Vehicle Number: " + this.vehicleNumber);
		System.out.println("Vehicle Model: " + this.model);
		System.out.println("Company Name: " + this.companyName);
		System.out.println("No of Wheels: " + this.noOfWheels);
		System.out.println("Price: " + this.price);
	}
	
} //Vehicle class ends here

class Bike extends Vehicle{
	int noOfStands;
	int noOfHelmets;
	String bikeCategory;
	
	public Bike() {
		super();
		this.noOfStands = 0;
		this.noOfHelmets = 0;
		this.bikeCategory = "Not Given";
    }

	Bike(String vehicleNumber, String model, String companyName, int noOfWheels, double price, int noOfStands, int noOfHelmets, String bikeCategory) {
		super(vehicleNumber, model, companyName, noOfWheels, price);
		this.noOfStands = noOfStands;
		this.noOfHelmets = noOfHelmets;
		this.bikeCategory = bikeCategory;
	}

	int getNoOfStands() {
		return noOfStands;
	}

	void setNoOfStands(int noOfStands) {
		this.noOfStands = noOfStands;
	}

	int getNoOfHelmets() {
		return noOfHelmets;
	}

	void setNoOfHelmets(int noOfHelmets) {
		this.noOfHelmets = noOfHelmets;
	}

	String getBikeCategory() {
		return bikeCategory;
	}

	void setBikeCategory(String bikeCategory) {
		this.bikeCategory = bikeCategory;
	}
	
	void applyBreak() {
		System.out.println("Bike using disk Breaks !");
	}
	
	void display() {
		super.display();
		System.out.println("Number Of Stands: " + this.noOfStands);
		System.out.println("Number of Helmets: " + this.noOfHelmets);
		System.out.println("Bike Category: " + this.bikeCategory);
	}
	
}// bike class ends here

class Car extends Vehicle{
	boolean hasPowerSteering;
	String driveMode;
	int parkingAssistSensors;
	
	public Car() {
		super();
		this.hasPowerSteering = false;
		this.driveMode = "Not Given";
		this.parkingAssistSensors = 0;
	}

	Car(String vehicleNumber, String model, String companyName, int noOfWheels, double price, boolean hasPowerSteering, String driveMode, int parkingAssistSensors) {
		super(vehicleNumber, model, companyName, noOfWheels, price);
		this.hasPowerSteering = hasPowerSteering;
		this.driveMode = driveMode;
		this.parkingAssistSensors = parkingAssistSensors;
	}

	boolean isHasPowerSteering() {
		return hasPowerSteering;
	}

	void setHasPowerSteering(boolean hasPowerSteering) {
		this.hasPowerSteering = hasPowerSteering;
	}

	String getDriveMode() {
		return driveMode;
	}

	void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
	}

	int getParkingAssistSensors() {
		return parkingAssistSensors;
	}

	void setParkingAssistSensors(int parkingAssistSensors) {
		this.parkingAssistSensors = parkingAssistSensors;
	}
	
	void applyBreak() {
		System.out.println("Car using HandBreak Breaks !");
	}
	
	void display() {
		super.display();
		System.out.println("Power Steering: " + this.hasPowerSteering);
		System.out.println("Drive Mode: " + this.driveMode);
		System.out.println("Parking Assist Sensors: " + this.parkingAssistSensors);
	}
}//Car class ends here

class Bus extends Vehicle{
	int passengerCapacity;
	int standingCapacity;
	
	public Bus() {
		super();
		this.passengerCapacity = 0;
		this.standingCapacity = 0;
	}

	Bus(String vehicleNumber, String model, String companyName, int noOfWheels, double price, int passengerCapacity, int standingCapacity) {
		super(vehicleNumber, model, companyName, noOfWheels, price);
		this.passengerCapacity = passengerCapacity;
		this.standingCapacity = standingCapacity;
	}

	int getPassengerCapacity() {
		return passengerCapacity;
	}

	void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	int getStandingCapacityl() {
		return standingCapacity;
	}

	void setStandingCapacityl(int standingCapacity) {
		this.standingCapacity = standingCapacity;
	}
	
	void applyBreak() {
		System.out.println("Bus using hydrolics HandBreak Breaks !");
	}
	
	void display() {
		super.display();
		System.out.println("Passenger Capacity: " + this.passengerCapacity);
		System.out.println("Standing Capacity: " + this.standingCapacity);
	}
}// Bus class ends here



public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle v1;
		v1 = new Bike("MH12 2003", "Honda100", "Honda", 2, 80000, 2, 1, "Semi Sports");
		v1.display();
		v1.applyBreak();
		System.out.println();
		
		v1 = new Car("MH12 6545", "Maruti800", "Maruti Suzuki", 4, 100000, false, "Manual", 0);
		v1.display();
		v1.applyBreak();
		System.out.println();
		
		v1 = new Bus("MH12 2343", "Traveller01", "Travellers", 4, 200000, 10, 5);
		v1.display();
		v1.applyBreak();
		System.out.println();
		
		v1 = new Bike();
		v1.display();
		v1.applyBreak();
	}

}
