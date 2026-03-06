import java.util.Scanner;

abstract class ElectricityBill{
	String customerName;
	double unitsConsumed;
	
	ElectricityBill() {
		this.customerName = "Not Avilable";
		this.unitsConsumed = 0;
	}

	ElectricityBill(String customerName, double unitsConsumed) {
		this.customerName = customerName;
		this.unitsConsumed = unitsConsumed;
	}

	String getCustomerName() {
		return customerName;
	}

	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	double getUnitsConsumed() {
		return unitsConsumed;
	}

	void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	@Override
	public String toString() {
		return "customerName = " + customerName + "\nunitsConsumed = " + unitsConsumed;
	}
	
	void showUsage() {
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Units Consumed: " + this.unitsConsumed);
	}
	
	abstract double calculateBill();
	
	final void generateBill() {
		this.showUsage();
		double afterTax = this.calculateBill()*0.05;
		double fixedCharge = 50;
		double totalBill = this.calculateBill() + afterTax + fixedCharge;
		System.out.println("Tax(5%): " + afterTax);
		System.out.println("Fixed Charge: " + fixedCharge);
		System.out.println("Total Bill: " + totalBill);
		
	}
	
} //ElectricityBill class ends here


class ResidentialBill extends ElectricityBill{
	
	public ResidentialBill() {
		super();
	}
	
	ResidentialBill(String customerName, double unitsConsumed) {
		super(customerName, unitsConsumed);
	}

	@Override
	double calculateBill() {
		
		double billAmount = 0;
		
		if(unitsConsumed > 0 && unitsConsumed <= 100) billAmount = unitsConsumed * 2.5;
		else if(unitsConsumed >= 101 && unitsConsumed <= 300) billAmount = (100 * 2.5) + ((unitsConsumed - 100) * 3.5);
		else if(unitsConsumed > 300) billAmount = (100*2.5) + (200*3.5) + ((unitsConsumed-300)*5);
		
		if(unitsConsumed > 500) billAmount += 150;
		
		return billAmount;
	}	
}//Residential class ends here

class CommercialBill extends ElectricityBill{
	
	public CommercialBill() {
		super();
	}
	
	CommercialBill(String customerName, double unitsConsumed) {
		super(customerName, unitsConsumed);
	}

	@Override
	double calculateBill() {

	    double billAmount = this.unitsConsumed * 6.5;

	    if (this.unitsConsumed < 200) return 1500;

	    if (this.unitsConsumed > 1000) billAmount = billAmount + (billAmount * 0.08);

	    return billAmount;
	}
	
}//commercial Bill class ends here

public class TestElectricityBill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Residential\n2.Commercial");
		System.out.println("select customer type: ");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:{
				System.out.println("Enter Name: ");
				sc.nextLine();
				String custName = sc.nextLine();
				System.out.println("Units Consumed: ");
				double unitsConsumed = sc.nextDouble();
				
				ElectricityBill e1 = new ResidentialBill(custName, unitsConsumed);
				System.out.println();
				e1.generateBill();
				break;
			}
			case 2:{
				System.out.println("Enter Name: ");
				sc.nextLine();
				String custName = sc.nextLine();
				System.out.println("Units Consumed: ");
				double unitsConsumed = sc.nextDouble();
				
				ElectricityBill e1 = new CommercialBill(custName, unitsConsumed);
				System.out.println();
				e1.generateBill();
			}
			
			sc.close();
		}

	}

}
