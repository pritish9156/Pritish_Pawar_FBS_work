abstract class InsurancePolicy{
	String policyHolderName;
	double basePremium;
	
	InsurancePolicy() {
		this.policyHolderName = "Not Given";
		this.basePremium = 0;
	}
	
	InsurancePolicy(String policyHolderName, double basePremium) {
		this.policyHolderName = policyHolderName;
		this.basePremium = basePremium;
	}

	String getPolicyHolderName() {
		return policyHolderName;
	}

	void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	double getBasePremium() {
		return basePremium;
	}

	void setBasePremium(double basePremium) {
		this.basePremium = basePremium;
	}

	@Override
	public String toString() {
		return "policyHolderName = " + policyHolderName + "\nbasePremium = " + basePremium;
	}
	
	abstract double calculatePremium();
	
	void printPolicyDetails() {
		System.out.println("Policy Holder Name: " + this.policyHolderName);
		System.out.println("Base Premium: " + this.basePremium);
		System.out.println("Premium Approved: " + this.calculatePremium());
	}
}//InsurancePremium class ends here

class CarInsurance extends InsurancePolicy{
	int carAgeInYears;
	boolean hadAccidentInLastYear;
	double carValueInRupees;
	
	public CarInsurance() {
		super();
		this.carAgeInYears = 0;
		this.carAgeInYears = 0;
		this.hadAccidentInLastYear = false;
		this.carValueInRupees = 0;
	}

	CarInsurance(String policyHolderName, double basePremium, int carAgeInYears, boolean hadAccidentInLastYear, double carValueInRupees) {
		super(policyHolderName, basePremium); 
		this.carAgeInYears = carAgeInYears;
		this.hadAccidentInLastYear = hadAccidentInLastYear;
		this.carValueInRupees = carValueInRupees;
	}
	

	int getCarAgeInYears() {
		return carAgeInYears;
	}

	void setCarAgeInYears(int carAgeInYears) {
		this.carAgeInYears = carAgeInYears;
	}

	boolean ishadAccidentInLastYear() {
		return hadAccidentInLastYear;
	}

	void sethadAccidentInLastYear(boolean hadAccidentInLastYear) {
		this.hadAccidentInLastYear = hadAccidentInLastYear;
	}

	double getCarValueInRupees() {
		return carValueInRupees;
	}

	void setCarValueInRupees(double carValueInRupees) {
		this.carValueInRupees = carValueInRupees;
	}
	

	@Override
	public String toString() {
		return super.toString()+"\ncarAgeInYears=" + carAgeInYears + "\nhadAccidentInLastYear=" + hadAccidentInLastYear
				+ "\ncarValueInRupees = " + carValueInRupees;
	}

	@Override
	double calculatePremium() {
		
		double finalApprovedAmount = 0;
		
		if(carAgeInYears <= 3) finalApprovedAmount = basePremium + basePremium*0.10;
		else if(carAgeInYears >= 4 && carAgeInYears <=7) finalApprovedAmount = basePremium + basePremium*0.20;
		else if(carAgeInYears > 7) finalApprovedAmount = basePremium + basePremium*0.30;
		
		
		if(hadAccidentInLastYear) finalApprovedAmount += finalApprovedAmount*0.25;
		else finalApprovedAmount -= finalApprovedAmount*0.10;
		
		
		if(carValueInRupees > 1000000) finalApprovedAmount += 2000;
		
		
		return finalApprovedAmount;
	}
	
	
}//CarInsurance class ends here

class HealthInsurance extends InsurancePolicy{
	
	int age;
	boolean isSmoker;
	boolean hasPreExistingDisease;
	
	public HealthInsurance() {
		super();
		this.age = 0;
		this.isSmoker = false;
		this.hasPreExistingDisease = false;
	}

	HealthInsurance(String policyHolderName, double basePremium, int age, boolean isSmoker, boolean hasPreExistingDisease) {
		super(policyHolderName, basePremium);
		this.age = age;
		this.isSmoker = isSmoker;
		this.hasPreExistingDisease = hasPreExistingDisease;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	boolean isSmoker() {
		return isSmoker;
	}

	void setSmoker(boolean isSmoker) {
		this.isSmoker = isSmoker;
	}

	boolean isHasPreExistingDisease() {
		return hasPreExistingDisease;
	}

	void setHasPreExistingDisease(boolean hasPreExistingDisease) {
		this.hasPreExistingDisease = hasPreExistingDisease;
	}

	@Override
	public String toString() {
		return super.toString()+"\nage = " + age + "\nisSmoker = " + isSmoker + "\nhasPreExistingDisease = "
				+ hasPreExistingDisease;
	}

	@Override
	double calculatePremium() {
		
		double finalApprovedAmount = 0;
		
		if(age < 30) finalApprovedAmount = basePremium + basePremium*0.10;
		else if(age >= 30 && age <= 45) finalApprovedAmount = basePremium + basePremium*0.25;
		else if(age > 45) finalApprovedAmount = basePremium + basePremium*0.40;
		
		if(isSmoker) finalApprovedAmount += finalApprovedAmount*0.30;
		else finalApprovedAmount -= finalApprovedAmount*0.05;
		
		if(hasPreExistingDisease) finalApprovedAmount += finalApprovedAmount*0.20;
		
		return finalApprovedAmount;
	}
	
}//healthInsurance class ends here


public class TestInsurancePremium {

	public static void main(String[] args) {
		
		InsurancePolicy ip1 = new CarInsurance("Ramesh", 10000, 10, false, 100000);
		
		ip1.printPolicyDetails();
		System.out.println();
		
		InsurancePolicy ip2 = new HealthInsurance("Rajesh", 10000, 35, true, true);
		ip2.printPolicyDetails();

	}

}
