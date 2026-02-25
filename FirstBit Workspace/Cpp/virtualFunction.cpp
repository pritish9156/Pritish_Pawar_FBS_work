//virtual function -> to achive runtime polymorphism/ late binding/ runtime binding

#include<iostream>
using namespace std;

class Shape{
	public:
	virtual void area(){
		cout<<"calculating area";
	};
};

class Circle: public Shape{
	public:
	void area(){
		cout<<"\ncircle area";
	}
};

int main(){
	Shape* ptr;
	Shape* ptr2 = new Circle(); 
	
	Circle* cPtr;
	
	Circle c;
	Shape s;
	
	ptr = &c;
	
	ptr->area();
	ptr2->area();

	
	return 0;
}
	