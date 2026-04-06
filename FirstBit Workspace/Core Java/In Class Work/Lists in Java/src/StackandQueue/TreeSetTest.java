package StackandQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	int rollNO;
	String name;
	int marks;
	
	Student(int rollNO, String name, int marks) {
		super();
		this.rollNO = rollNO;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\nStudent [rollNO=" + rollNO + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.rollNO - o.rollNO;
	}

	@Override
	public int hashCode() {
		return this.rollNO;
	}

	@Override
	public boolean equals(Object obj) {
		Student st = (Student)obj;
		
		if(this.rollNO == st.rollNO)
			return true;
		else
			return false;
	}
	
}

public class TreeSetTest {
	
	public static void main23(String[] args) {
		ArrayList <Student> hs = new ArrayList<Student>();
		hs.add(new Student(10, "Sachin", 100));
		hs.add(new Student(18, "Virat", 87));
		hs.add(new Student(7, "Dhoni", 16));
		
		MyMarksComparator mmc = new MyMarksComparator();
		
		System.out.println("Before\n\n"+hs);
		Collections.sort(hs, mmc);
		System.out.println("After\n\n"+hs);
		
	}
	
	public static void main3(String[] args) {
		HashSet <Student> hs = new HashSet<Student>();
		
		hs.add(new Student(10, "Sachin", 100));
		hs.add(new Student(18, "Virat", 87));
		hs.add(new Student(7, "Dhoni", 16));
		
		System.out.println(hs);
		
		if(hs.contains(new Student(73, "ss", 100)))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
	}

	public static void main(String[] args) {
		TreeSet <Student> st = new TreeSet<Student>();
		
		st.add(new Student(10, "Sachin", 100));
		st.add(new Student(18, "Virat", 87));
		st.add(new Student(7, "Dhoni", 16));
		st.add(new Student(5, "Dhoni", 16));
		
		System.out.println(st);

		if(st.contains(new Student(5, "Virat", 87)))
		{
			System.out.println("Found");
		}
		else
			System.out.println("Not Found");
		
	}
	
	public static void main1(String[] args) {
		
		TreeSet t1 = new TreeSet();
		
		t1.add(100);
		t1.add(109);
		t1.add(7);
		t1.add(48);
		t1.add(130);
		t1.add(103);
		t1.add(28);
		t1.add(6);
		t1.add(300);
		t1.add(125);
		
		System.out.println(t1);
		
	}

}
