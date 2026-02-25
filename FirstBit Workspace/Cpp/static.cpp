//static 
#include<iostream>
#include<vector>
using namespace std;

class Employee{
	protected:
		int empId;
		string empName;
		double basicSal;
		static int nextId;
	
	public:
		Employee(){
			empId = 0;
			empName = "Not Given";
		}
		
		Employee(string empName, double basicSal){
			this->empId = ++nextId;
			this->empName = empName;
			this->basicSal = basicSal;
		}
		
		void setEmpName(string name){
			this->empName = name;
		}
		
		int getEmpId(){
			return this->empId;
		}
		
		string getEmpName(){
			return this->empName;
		}
		
		virtual void display() = 0;
		
};

int Employee::nextId = 0;

class Developer: public Employee{
	double allowance;
	
	public:
		
		Developer(){
			this->allowance = 0;
		}
		
		Developer(string name, double basicSal, double allowance): 
							Employee(name,basicSal)
		{
			this->allowance = allowance;
		}
		
		void setAllowance(double allowance){
			this->allowance = allowance;
		}
		
		double getAllowance(){
			return this->allowance;
		}
		
		void display(){
			cout << "   [Developer]" <<endl;
			cout << "Employee Id: " << this->empId << endl;
			cout << "Employee Name: " << this->empName << endl;
			cout << "Employee Basic Salary: " << this->basicSal << endl;
			cout << "Employee Allowance: " << this->allowance << endl;
			cout << "Total Salary: " << this->basicSal + this->allowance << endl;
			cout << endl;
		}
};

class Manager: public Employee{
	double bonus;
	
	public:
		Manager(){
			bonus = 0;
		}
		
		Manager(string name, double basicSal, double bonus):
				Employee(name, basicSal)
		{
			this->bonus = bonus;
		}
		
		void setBonus(double bonus){
			this->bonus = bonus;
		}
		
		double getBonus(){
			return this->bonus;
		}
		
		void display(){
			cout << "   [Manager]" <<endl;
			cout << "Employee Id: " << this->empId << endl;
			cout << "Employee Name: " << this->empName << endl;
			cout << "Employee Basic Salary: " << this->basicSal << endl;
			cout << "Employee Bonus: " << this->bonus << endl;
			cout << "Total Salary: " << this->basicSal + this->bonus << endl;
			cout << endl;
		}
};

int main(){
	Employee* empPtr[10];
	
	*(empPtr) = new Developer("Ramesh", 10000, 100);
	*(empPtr+1) = new Manager("Ramesh", 10000, 100);
	
	empPtr[0]->display();
	empPtr[1]->display();
	
	vector<Employee*> empVector;
	
	empVector.push_back(new Developer("Ramesh", 10000, 100));
	empVector.back()->display();

}