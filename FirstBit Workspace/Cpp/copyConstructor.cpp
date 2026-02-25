//copy constructor

//done sir pritish
#include<iostream>
using namespace std;

class Demo{
	private:
		int a;
		
	public:
		//default constructor
		Demo(){
			a=0;
		}
			
		//copy constructor
		Demo(Demo &obj){
			this->a = obj.a;
		}
	
		void setData(int a){
			this->a = a;
		}
			
		int getData(){
			return a;
		}
	
};

int main(){
	
	Demo d1;
	
	d1.setData(5);
	
	Demo d2(d1); //copy constructor
	
	cout << "Object 1(d1): "<< d1.getData() << endl;
	cout << "Object 2(d2): "<< d2.getData() << endl;
	
	return 0;
}