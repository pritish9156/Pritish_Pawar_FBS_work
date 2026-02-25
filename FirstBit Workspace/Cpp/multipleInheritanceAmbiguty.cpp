//multiple inheritance ambugity issue
#include<iostream>
using namespace std;

class A{
	protected:
	int a;
	
	public:
		void input(){
			cout<<"Enter value of a: ";
			cin>>a;
		}
		
		void display(){
			cout<< a <<endl;
		}
};

class B{
	protected:
	int b;
	
	public:
		void input(){
			cout<<"Enter value of b: ";
			cin>>b;
		}
		
		void display(){
			cout<< b <<endl;
		}
};

class C: public A, public B{
	protected:
	int c;
	
	public:
		void input(){
			A::input();
			B::input();
			cout<<"Enter value of c: ";
			cin>>c;	
		}
		
		void display(){
			A::display();
			B::display();
			cout<< c <<endl;
		}
};

int main(){
	C aa;
	
	aa.input();
	aa.display();
}