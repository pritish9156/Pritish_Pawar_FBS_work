package p1;

public class A {
	
	void myFunA() {
		System.out.println("Inside class A");
	}
}

class B extends A{
	
	public void myFunB() {
		myFunA();
	}
}

