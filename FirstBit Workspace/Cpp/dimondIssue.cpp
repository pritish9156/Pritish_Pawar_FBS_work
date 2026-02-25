//dimond problem / virtual base class
//multiple inheritance ambugity issue
#include<iostream>
using namespace std;

class Base{
	protected:
	int base;
	
	public:
//		void input(){
//			cout<<"Enter value of base: ";
//			cin>>base;
//		}
//		
//		void display(){
//			cout<< base <<endl;
//		}

		Base(){
			cout<<"Base constructor called";
		}
};

class A: virtual public Base{

};

class B: virtual public Base{

};

class C: public A, public B{

};

int main(){
	C aa;
	
}