class ElectricityBill{
	
	int consumerNumber;
	String ConsumerName;
	double unitsConsumed;
	static double ratePerUnit;
	
	static {
		ratePerUnit = 10;
	}
	
	ElectricityBill(){
		this.consumerNumber = 0;
		this.ConsumerName = "Not avilable";
		this.unitsConsumed = 0;
	}
	
	ElectricityBill(int consumerNumber, String consumerName, double unitsConsumed) {
		this.consumerNumber = consumerNumber;
		ConsumerName = consumerName;
		this.unitsConsumed = unitsConsumed;
	}

	int getConsumerNumber() {
		return consumerNumber;
	}

	void setConsumerNumber(int consumerNumber) {
		this.consumerNumber = consumerNumber;
	}

	String getConsumerName() {
		return ConsumerName;
	}

	void setConsumerName(String consumerName) {
		ConsumerName = consumerName;
	}

	double getUnitsConsumed() {
		return unitsConsumed;
	}

	void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	static double getRatePerUnit() {
		return ratePerUnit;
	}

	//method to update the electricity rate
	static void setRatePerUnit(double RPU) {
		ratePerUnit = RPU;
	}
	
	//method to calculate and return total bill
	double calTotalBill() {
		return this.unitsConsumed*ratePerUnit;
	}
	
	void display() {
		System.out.println("Consumer Number: " + this.consumerNumber);
		System.out.println("Consumer Name: " + this.ConsumerName);
		System.out.println("Total units consumed: " + this.unitsConsumed);
		System.out.println("Rate Per units: " + ratePerUnit);
		System.out.println("Total Bill Amount: " + this.calTotalBill());
		System.out.println();
	}
	
}


public class TestElectricityBill {

	public static void main(String[] args) {
		
		ElectricityBill eb1 = new ElectricityBill(101, "Ramesh", 100);
		ElectricityBill eb2 = new ElectricityBill(102, "Pawr", 500);
		ElectricityBill eb3 = new ElectricityBill(103, "Rajesh", 1000);
		
		eb1.display();
		eb2.display();
		
		ElectricityBill.setRatePerUnit(20);
		
		eb3.display();

	}

}
