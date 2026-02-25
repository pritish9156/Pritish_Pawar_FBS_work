//input output
#include<iostream>
using namespace std;

int main(){
	
	int age;
	char name[50];
	double salary;
	
	cout << "Enter age: " << endl;
	cin >> age;
	
	cin.ignore();
	cout << "Enter name: " << endl;
	cin.getline(name,50);
	
	cout << "Age: " << age << "Name: " << name << endl;
	
	cout << endl;
	
	cout << "Enter name: " << endl;
	cin.getline(name,50);
	
	cout << "Enter salary: " << endl;
	cin >> salary;
	
	cout << "Name: " << name;
	cout << "Salary: " << salary;
	

}