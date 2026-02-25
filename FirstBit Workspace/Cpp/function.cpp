//function
#include<iostream>
using namespace std;

class Employee{
	private:
	string name;
	double salary;
	
	public:
	Employee(string name, double salary){
		this->name = name;
		this->salary = salary;
	}
	
	double calculateBonus(){
		return salary * 0.10;
	}
	
	double calculateBonus(double percent){
		return salary * percent/100;
	}
	
	void display(){
		cout << "Name: " << name << endl;
		cout << "Bonus(10%): " << calculateBonus() << endl;
		cout << "Bonus(20%): " << calculateBonus(20) << endl;
	}
};

int main(){
	Employee e1("pritish", 10000);;
	e1.display();
}