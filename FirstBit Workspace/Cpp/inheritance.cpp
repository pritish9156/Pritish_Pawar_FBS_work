//inheritance
#include<iostream>
using namespace std;

class Person{
	string name;
	int age;
	
	public:
		Person(string name, int age){
			this->name = name;
			this->age = age;
		}
		
		void setPerson(string name, int age){
			this->name = name;
			this->age = age;
		}	
		
		void displayPerson(){
			cout << "Name: " << name << endl;
			cout << "Age: " << age << endl;
		}
};

class Student: public Person{
	int marks;
	
	public:
		
	Student(string name, int age, int marks)
		: Person(name,age) //using initializer list
	{
			
		this->marks = marks;	
	}
	
	void setstudent(int marks){
		this->marks = marks;
	}
	
	void displayStudent(){
		Person::displayPerson(); //using scope resolution operator
		cout << "Student marks: " << marks << endl;
	}
};

int main(){
	Student s1("pritish",22,60);
	s1.displayStudent();
	
}