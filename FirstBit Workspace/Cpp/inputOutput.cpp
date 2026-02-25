//input output
#include<iostream>
using namespace std;

int main(){
	string name, city;
	double salary;
	
	cout << "Enter Name: ";
	getline(cin, name);
	
	cout << "Enter city: ";
	getline(cin, city); //for string
	
	cout << "Enter salary: ";
	cin >> salary;
	
	cout << "\nMy name is " << name <<endl;
	cout << "I live in " << city << endl;
	cout << "My salary is " << salary << endl;
	
	return 0;
}