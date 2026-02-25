#include<iostream>
using namespace std;

int isPrime(int,int);

int isPrime(int num){
	for(int i=2; i<=num/2; i++){
		if(num%i==0){
			return 1;
		}
	}
	
	return 0;
} 

int main(){
	
	int  a = 35, b = 40, c = 10;
	
	
	if(a%2 == 0) cout << "even"<<endl;
	else cout << "odd"<<endl;
	
	cout<<endl;
	
	cout<< "Greatest of three numbers" << endl;
	
	a>b ? 
		a>c ? cout<<"a is greater"<<endl : 
		cout<<"c is greater"<<endl
	: 
		b>c ? cout<<"b is greater"<<endl : 
		cout<<"c is greater"<<endl;
		
	cout<<endl;
	
	cout<< "print 1 to n"<<endl;
	
	int n = 5;
	
	for(int i=1; i<=5; i++)
		cout << i << endl;
		
	cout<<endl;
	
	cout<< "sum of digits"<<endl;
	
	int num = 1234;
	
	int sum=0;
	
	while(num > 0){
		int rem = num%10;
		sum += rem;
		num /= 10;
	}
	
	cout << "sumof digits: " << sum << endl;
	
	cout<<endl;
	
	cout<< "reverse a number"<<endl;
	
	int num1 = 1234;
	int rev = 0;
	
	while(num1 > 0){
		int rem = num1%10;
		rev = rev*10 + rem;
		num1 /= 10;
	}
	
	cout<< "reverse a number: "<< rev <<endl;
	
	cout<<endl;
	
	cout<< "Prime number"<<endl;
	
	int num3 = 4;
	
	int flag = isPrime(num3);
	
	if(flag==0) cout<<num3<<" is prime number"<<endl;
	else cout<<num3<<" is not an prime number"<<endl;
	
	cout<<endl;
	cout<< "Fibonacci: ";
	int first = 0;
	int next = 1;
	
	for(int i=0; i<=5; i++){
		
		cout<<first<<" ";
		int temp = first;
		first = next;
		next = temp + next;
		
	}
	
}      

int isPrime(int num, int temp){
	for(int i=2; i<=num/2; i++){
		if(num%i==0){
			return 1;
		}
	}
	
	return 0;
} 