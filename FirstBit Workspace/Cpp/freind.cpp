//friend function
#include<iostream>
using namespace std;

class Demo{
	int x;
	int y;
	
	public:
	friend void friendFunction(Demo);
	void display();
};

void friendFunction(Demo d1){
	d1.x = 2;
	d1.y = 2;
	
	cout<<d1.x+d1.y;
}

void Demo::display(){
	cout<<"display method";
}

int main(){
	Demo d1;
	friendFunction(d1);
	
	d1.display();
}