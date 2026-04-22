package linkedlist.singlylinkedlist.generictype;

public class Student implements Comparable<Student>{

	String name;
	int roll;
	
	public Student() {
		this.name = "not avilaible";
		this.roll = 0;
	}
	
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "\nname= " + name + ", roll= " + roll + "\n";
	}


	@Override
	public int compareTo(Student o) {
		return this.roll-o.roll;
	}
	
}
