//class - userdefined datatype binds data and behaviours
//object - instance of class
#include<iostream>
using namespace std;

class Student{
	private:
	int rollNo;
	string name;
	double marks;
	
	public:
		
		Student(){
			rollNo = 0;
			name = "Not Given";
			marks = 0;
		}
		
		Student(int rollNo, string name, double marks){
			this->rollNo = rollNo;
			this->name = name;
			this->marks = marks;
		}
		
		~Student(){ //to release resouces when an object is destroyed
			cout << "destructor called" << this->rollNo << endl;
		}
		
		void setData(int roll, string n, double m){
			rollNo = roll;
			name = n;
			marks = m;
		}
		
		void display(){
			cout << "Roll no: " << rollNo << endl;
			cout << "Name: " << name << endl;
			cout << "Marks: " << marks << endl;
			cout << endl;
		}
};

int main(){
	Student s1;
	Student s2(2,"Rakesh",55);
	
	s1.display();
	s1.setData(1,"Pritish",45);
	s1.display();
	s2.display();
}