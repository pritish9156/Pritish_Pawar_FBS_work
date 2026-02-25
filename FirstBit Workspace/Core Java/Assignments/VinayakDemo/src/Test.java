class Employee{
	int id;
	String name;
	double salary;
	
	 Employee() {
		this.id=0;
		this.name="Not Given";
		this.salary=0;
	}

	Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Employee id: " + this.id);
		System.out.println("Employee name: " + this.name);
		System.out.println("Employee salary: " + this.salary);
	}
	
	double calSal()
	{
		return salary;
	}
}//employee class ends here

class Admin extends Employee{
	double allowance;
	
	public Admin() {
		// TODO Auto-generated constructor stub
		super();
		this.allowance=0;
	}

	Admin(int id, String name, double salary, double allowance) {
		super(id,name,salary);
		this.allowance = allowance;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	void display() {
		super.display();
		System.out.println("Allowance: " + this.allowance);
	}
	double calSal()
	{
		return salary+allowance;
	}

}//admin class ends here

class SalesManager extends Employee{

	//Attributes
	double incentive;
	int target;

	//constructors
	//default
	SalesManager(){
		super();
		this.incentive = 1000;
		this.target = 10000;
	}

	

	SalesManager(int id, String name, double salary, double incentive, int target) {
		super(id,name,salary);
		this.incentive = incentive;
		this.target = target;
	}

	void setIncentive(double incen){
		this.incentive = incen;
	}

	void setTarget(int tar){
		this.target = tar;
	}

	//getters

	double getIncentive(){
		return this.incentive;
	}

	int getTarget(){
		return this.target;
	}

	void display(){
		super.display();
		System.out.println("Incentive: " + incentive);
		System.out.println("Target: " + target);
	}

	double calSal()
	{
		return salary+incentive;
	}

}//SalesManager class ends here

class HR extends Employee{

	//Attributes
	int commission;

	//constructor
	//default

	HR(){
		super();
		this.commission = 5;
	}


	//parametarised

	HR(int i, String name, double sal, int com){
		super(i,name,sal);
		this.commission = com;
	}

	void setCommission(int com){
		this.commission = com;
	}

	//getters
	int getCommission(){
		return this.commission;
	}

	void display(){
		super.display();
		System.out.println("HR Commission: " + commission + "%");
	}

	double calSal()
	{
		return salary+commission;
	}

}//HR class Ends here

class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1;//generic reference
		e1= new Employee(101, "Sachin", 10000);
		e1.display();
		System.out.println("Calculated salary is "+e1.calSal());
		System.out.println();
		
		e1= new SalesManager(102, "Virat", 20000, 2000, 20);//up casting
		e1.display();
		System.out.println("Calculated salary is "+e1.calSal());
		System.out.println();
		
		e1= new Admin(103, "Rohit", 30000, 300);//up casting
		e1.display();
		System.out.println("Calculated salary is "+e1.calSal());

	}

}
