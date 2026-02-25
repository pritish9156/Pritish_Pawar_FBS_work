#include<iostream>
using namespace std;
//deep copy shallow copy

class Hero{
	public:
	char* name;
	char level;
	int health;
	
	public:
	Hero(){
		name = new char[100];
	}
	
	Hero(char name[], char level, int health){
		strcpy(this->name, name);
		this->level = level;
		this->health = health;
	}
	
	Hero(Hero& temp){
		char* temp1 = new char[strlen(this->name)+1];
		strcpy(temp1,temp.name);
		
		strcpy(this->name,temp1);
		this->level = temp.level;
		this->health = temp.health;
	}
	
	void display(){
		cout << "[Name: " << this->name << ", ";
		cout << "Level: " << this->level << ", ";
		cout << "Health: " << this->health << "]";
		cout << endl;
	}
	
};

int main(){
	Hero ramesh;
	
	char name[7] = "ramesh";
	
	ramesh.name = name;
	ramesh.level = 'A';
	ramesh.health = 40;
	
	ramesh.display();
	
	Hero krish(ramesh);
	
	krish.display();
	
	cout<<endl;
	
	ramesh.name[0] = 'G';
	ramesh.health = 70;
	ramesh.level = 'M';
	
	ramesh.display();
	krish.display();
	
}